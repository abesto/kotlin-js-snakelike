`logic` has pure Kotlin code, no dependencies on JavaScript. That code can thus be tested with `gradle test`.

`ui` has JS-specific code, only used when compiling the JavaScript output.

## Why separate them into projects?

Because IntelliJ is smart, and if a module has the kotlin-js library as a dependency, then it refuses to see stuff like JUnit. This makes writing tests a pain. This way only the pure JVM module has JUnit as a dependency.

Also note: the JS module (`ui`) reaches out for the source files of `logic` during compilation. This is because I couldn't get the js code generated from `ui` to find the js code generated from `logic`.
