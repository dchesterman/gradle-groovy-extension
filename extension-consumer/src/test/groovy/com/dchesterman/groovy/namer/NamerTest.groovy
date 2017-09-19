package com.dchesterman.groovy.namer

import spock.lang.Specification

class NamerTest extends Specification {

    def 'test string'() {
        expect:
        'test'.sayMyName() == 'Dustin'
    }

}
