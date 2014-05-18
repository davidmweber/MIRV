# MIRV

A minimal example of using SBT, native packaging and sub-projects. Builds are pretty straight forward:

```bash
# Compile and run the server
sbt server/run

# Run the client
sbt client/run

# Build Debian packages (requires fakeroot to be installed)
sbt debian:packageBin
```
The `deb` files will be in `client/target` and `server/target`.

### Helpful links

1. SBT native packager [documentation](http://www.scala-sbt.org/sbt-native-packager/)
1. Multiproject packaging Stack Overflow [answer](http://stackoverflow.com/questions/20526275/how-to-use-sbt-native-packager-with-subprojects-sbt-0-13?rq=1)
