 
listView('TesteBefore12344 Jobs') {
    description('TesteBefore12344 Jobs')
    jobs {
        regex('TesteBefore12344_.+')
    }
    columns {
        status()
        weather()
        name()
        lastSuccess()
        lastFailure()
        lastDuration()
        buildButton()
    }
}
