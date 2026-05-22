# Implementation of refinement types for Scala

All commands in "Tests" and "Formatting" below should be run and successfully pass before every commit.

## Tests

### Compilation tests

```
sbtn "scala3-nonbootstrapped/testCompilation qualified-types"
sbtn "scala3-bootstrapped/testCompilation qualified-types"
```

Important to also check with coverage, using `--enable-coverage-phase`:

```
sbtn "scala3-nonbootstrapped/testCompilation --enable-coverage-phase qualified-types"
sbtn "scala3-bootstrapped/testCompilation --enable-coverage-phase qualified-types"
```

To update checkfiles, use `--update-checkfiles`:

```
sbtn "scala3-bootstrapped/testCompilation qualified-types --update-checkfiles"
```

### Printing tests

```
sbtn "scala3-compiler-nonbootstrapped/testOnly *Printing*"
```

To update checkfiles:

```
sbtn "scala3-compiler-nonbootstrapped/testOnly *Printing* -- -Ddotty.tests.updateCheckfiles=TRUE"
```

### Unit tests

```
sbtn "scala3-compiler-nonbootstrapped/testOnly *ENode*"
sbtn "scala3-compiler-nonbootstrapped/testOnly *EGraph*"
```

## Formatting

```
scala-cli format compiler/src/dotty/tools/dotc/qualified_types
```
