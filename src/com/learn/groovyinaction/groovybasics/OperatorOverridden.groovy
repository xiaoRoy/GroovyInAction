package com.learn.groovyinaction.groovybasics

import groovy.transform.Immutable


@Immutable
class Money{
    int amount
    String currency

    Money plus(Money another){
        if(null == another){
            return this
        }
        if(another.currency != currency){
            throw new IllegalArgumentException(
                    "cannot add $another.currency to $currency"
            )
        }
        return new Money(another.amount + amount, currency)
    }

    Money plus(Integer more){
        return new Money(amount + more, currency)
    }
}

Money buck = new Money(1, 'USD')
assert buck
assert buck == new Money(1, 'USD')
assert buck + buck == new Money(2, 'USD')

assert buck + 1 == new Money(2, 'USD')
