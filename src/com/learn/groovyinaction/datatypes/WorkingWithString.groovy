package com.learn.groovyinaction.datatypes

def name = 'tom'

//single quote
def singleQuote = 'hello tom'

//double quote
/*
*  if the text contains unescaped dollar signs,
*  the dollar sign introduces a placeholder,
*  and the string will be treated as a GString instead of a plain string.
* */
def doubleQuote = "hello $name"


def totalPrice = 0.02f
//tripleSQuote
/*
* allows the literal to span several lines.
* New lines are always treated as \n regardless of the platform,
* but all other whitespace is preserved as it appears in the text file.
* */
def tripleSingleQuote = '''
    total:
    $0.02
'''

def tripleDoubleQuote = """
    total:
    $totalPrice
"""

/*
* Strings with backslashes to be specified simply without having to escape all the backslashes.
* This is particularly useful with regular expressions.
* */

/*
* A back slash can’t appear as the last character of a slash string(\/\).
* */
def forwardSlash = /\a/

def forwardSlashUnicodeHex = /\u0025/
assert forwardSlashUnicodeHex == '%'

def forwardSlashWithBackSlashFollowByU = /\\u0025/
assert forwardSlashWithBackSlashFollowByU == '\\\\u0025'


def dollarSlash = $/\u0025/$
println dollarSlash

def realSlashU0025 = '\\u0025' //result \u0025

def date = "April, 1st"

def testDollarSlash = $/
    Hello, $name,
    toady we're ${date}
    $ dollar sign
    $$ escaped dollar sign
    \ back slash
    / forward slash
    $$$/ escaped opening dollar slashy
    $/$$ escaped closing dollar slashy 
/$

/*
* Note that in a double-quoted string,
* single quotes don’t need to be escaped, and vice versa.
* */

def sayHi = 'I said, "Hi!"'
def don = "don't"
