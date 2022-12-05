import simon.drugan.mercator.scala101finalPractical.ProjectCharacter

val guessOne: (String, Boolean) = ("hello", true)

val itemOne = ProjectCharacter(characterName = "hello", hasGlasses = true, hairColour = "brown", gender = "female")
val itemTwo = ProjectCharacter(characterName = "goodbye", hasGlasses = false, hairColour = "blonde", gender = "male")

val itemsList: List[ProjectCharacter] = List(itemOne, itemTwo)

itemsList.filter {
  character => !character.hasGlasses
}

itemsList


