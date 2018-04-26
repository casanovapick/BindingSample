# BindingSample
This is Android sample project for run CI pipeline.
we created 2 file for versioning project version.properties and versioning.gradle .
# version.properties
this file keep version name and build number. Jenkins will update this file after build successfully.


# versioning.gradle
this file has task to increase build number and method to read version name that use in build.gradle.
Task increase build number it will be call by Jenkins before build source code.