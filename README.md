`src/main/kotlin` has pure Kotlin code, no dependencies on JavaScript. That code can thus be tested with `gradle test`.

`src/main/kotlin-js` has JS-specific code, only used when compiling the JavaScript output.