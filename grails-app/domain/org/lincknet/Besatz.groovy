package org.lincknet

class Besatz {
    static belongsTo = [fish:Fish]
    Integer adultMale
    Integer adultFemale
    Integer toddlers

    static constraints = {
    }
}
