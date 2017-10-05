package com.learn.groovyinaction.groovybasics

//2.3.2 Using scripts
Book bookGroovyInAction = new Book('Groovy In Action');
assert bookGroovyInAction.getTitle() == 'Groovy In Action'
assert getTitleBackwards(bookGroovyInAction) == 'noitcA nI yvoorG'

static String getTitleBackwards(book){
    return book.getTitle().reverse();
}

//2.3.3 GroovyBeans
class BookBean{
    String title
}

def groovyBook = new BookBean()
groovyBook.setTitle('Groovy In Action')
assert groovyBook.getTitle() == 'Groovy In Action'

groovyBook.title = 'Groovy conquers the world'
assert groovyBook.title == 'Groovy conquers the world'
