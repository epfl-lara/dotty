# Refinement types for Scala

In Scala, we use the term "qualified types" to refer to what are commonly known as "refinement types". We use a different name to avoid confusion with Scala/DOT's structural refinement types.

## Running

```
sbtn "scalac -language:experimental.qualifiedTypes tests/pos-custom-args/qualified-types/list_collect.scala"
```

Useful check flags:

```
sbtn "scalac -Ycheck:all -Ytest-pickler -YcheckQualifiedTypes -language:experimental.qualifiedTypes tests/pos-custom-args/qualified-types/list_collect.scala"
```

## Tests

### Compilation tests

```
sbtn "scala3-nonbootstrapped/testCompilation qualified-types"
sbtn "scala3-bootstrapped/testCompilation qualified-types"
```

Important to also check with coverage:

```
sbtn "scala3-nonbootstrapped/testCompilation --enable-coverage-phase qualified-types"
sbtn "scala3-bootstrapped/testCompilation --enable-coverage-phase qualified-types"
```

`qualified-types` can be replaced by any subpath of a test file path. `list_collect` could be used to run only the test `tests/pos-custom-args/qualified-types/list_collect.scala` for example.

Test files: `tests/{pos,neg,warn,run}-custom-args/qualified-types`.

To update checkfiles:

```
sbtn "scala3-bootstrapped/testCompilation qualified-types --update-checkfiles"
```

### Printing tests

```
sbtn "scala3-compiler-nonbootstrapped/testOnly *Printing*"
```

Test files: `tests/printing/qualified-types*.scala`.

To update checkfiles:

```
sbtn "scala3-compiler-nonbootstrapped/testOnly *Printing* -- -Ddotty.tests.updateCheckfiles=TRUE"
```

### Unit tests

```
sbtn "scala3-compiler-nonbootstrapped/testOnly *ENode*"
sbtn "scala3-compiler-nonbootstrapped/testOnly *EGraph*"
```

## Formatting

```
scala-cli format compiler/src/dotty/tools/dotc/qualified_types
```

## Development guidelines

- Commands in "Tests" and "Formatting" above must be run and successfully pass before every commit.
- Markdown must be used in commit titles and messages.
- Doc comments must be concise. They must not describe implementation details.
