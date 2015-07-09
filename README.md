# [Confitura 2015](http://tech.viacom.com/warsawsdc/confitura2015/)
## Superdigit

We define superdigit of an integer x using the following rules:

* If x has only 1 digit, then its superdigit is x.
* Otherwise, the superdigit of x is equal to the superdigit of the digit-sum of x. Here, digit-sum of a number is defined as the sum of its digits.

For example, super digit of 98741 will be calculated as:

```
super-digit(98741) = super-digit(9+8+7+4+1)
                  = super-digit(29)
                  = super-digit(2+9)
                  = super-digit(11)
                  = super-digit(1+1)
                  = super-digit(2)
                  = 2.
```

## Solution
See [SuperDigit.superDigit(n: Int)](src/main/scala/pl/ts/SuperDigit.scala)
