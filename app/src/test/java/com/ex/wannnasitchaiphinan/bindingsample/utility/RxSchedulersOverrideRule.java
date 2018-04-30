package com.ex.wannnasitchaiphinan.bindingsample.utility;

import org.junit.rules.TestRule;
import org.junit.runner.Description;
import org.junit.runners.model.Statement;

import java.util.concurrent.Callable;

import io.reactivex.Scheduler;
import io.reactivex.android.plugins.RxAndroidPlugins;
import io.reactivex.functions.Function;
import io.reactivex.plugins.RxJavaPlugins;
import io.reactivex.schedulers.Schedulers;

public class RxSchedulersOverrideRule implements TestRule {

    @Override
    public Statement apply(Statement base, Description description) {
        return new RxSchedulersOverrideStatement(base);
    }

    private class RxSchedulersOverrideStatement extends Statement {
        private Function<Scheduler, Scheduler> trampoline = scheduler -> Schedulers.trampoline();
        private Function<Callable<Scheduler>, Scheduler> androidTrampoline = schedulerCallable -> Schedulers.trampoline();
        private Statement base;

        public RxSchedulersOverrideStatement(Statement base) {
            this.base = base;
        }

        @Override
        public void evaluate() throws Throwable {
            RxJavaPlugins.setIoSchedulerHandler(trampoline);
            RxJavaPlugins.setComputationSchedulerHandler(trampoline);
            RxJavaPlugins.setNewThreadSchedulerHandler(trampoline);
            RxAndroidPlugins.setInitMainThreadSchedulerHandler(androidTrampoline);
            try {
                base.evaluate();
            } finally {
                RxJavaPlugins.reset();
                RxAndroidPlugins.reset();
            }
        }
    }
}
