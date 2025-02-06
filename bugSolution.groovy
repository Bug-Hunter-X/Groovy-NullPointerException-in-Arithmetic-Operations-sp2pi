```groovy
def foo(a, b) {
  return a?.plus(b) ?: null // Use safe navigation operator and elvis operator
}

println foo(null, 5) // null
println foo(10, null) // null
println foo(10,20) //30
```