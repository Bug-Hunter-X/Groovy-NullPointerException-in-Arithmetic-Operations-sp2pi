```groovy
def foo(a, b) {
  if (a == null) return null
  return a + b
}

println foo(null, 5) // null
println foo(10, null) // NullPointerException
```