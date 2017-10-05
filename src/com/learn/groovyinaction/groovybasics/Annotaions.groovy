package com.learn.groovyinaction.groovybasics

import groovy.transform.Immutable
//2.3.4 Annotations

@Immutable
class FixedBook{
    String title
}

def groovyInAction = new FixedBook('Groovy In Action')
def anotherGroovyInAction = new FixedBook(title: 'Groovy In Action')
assert groovyInAction.title == 'Groovy In Action'
assert groovyInAction == anotherGroovyInAction
try {
    groovyInAction.title = 'Oops !'
    assert false, "should not reach here"
}catch (ReadOnlyPropertyException exception){
    println "Exception error: '$exception.message'"
}
