# mascalade-coderwall

[coderwall](https://coderwall.com/) API Scala wrapper library.

## Usege

```Scala
val user = Coderwall.getUser("sh0hei")
```
```Scala
Some(
  User(
    sh0hei,
    sh0hei,
    Japan,
    0,
    None,
    Account(Some(sh0hei),None,None),
    List(
      Badge(
        Forked,
        Have a project valued enough to be forked by someone else,
        Sun Apr 20 13:46:40 JST 2014,
        https://d3levm2kxut31z.cloudfront.net/assets/badges/forked1-50bad70cadd51c6093a79e122a1daa88.png
      ),
    )
  )
)
```

## License

```
Copyright (c) 2015 sh0hei
Released under the MIT license
http://opensource.org/licenses/mit-license.php
```
