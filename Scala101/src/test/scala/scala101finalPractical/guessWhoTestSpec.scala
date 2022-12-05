package simon.drugan.mercator
package scala101finalPractical

import org.scalatest.FlatSpec



class guessWhoTestSpec extends FlatSpec{

val finalPracticalMain = new finalPracticalMain

  "guessWhoGame" should "allow user to make glasses based guesses" in {
    val jonBonesJones: ProjectCharacter = ProjectCharacter(characterName = "Jon Jones", hasGlasses = false, hairColour = "Black", gender = "Male")
    val princessCamilla: ProjectCharacter = ProjectCharacter(characterName = "Princess Camilla", hasGlasses = true, hairColour = "Blonde", gender = "Female")
    val nedStark: ProjectCharacter = ProjectCharacter(characterName = "Ned Stark", hasGlasses = false, hairColour = "Brown", gender = "Male")

    val charactersList: List[ProjectCharacter] = List(jonBonesJones, princessCamilla, nedStark)

    val guessOne: (String, Boolean) = ("hasGlasses", true)

    val guessList: List[(String, Boolean)] = List(guessOne)
    assert(finalPracticalMain.areTheyBoolean(charactersList, guessList, nedStark).length === 2)
  }

  "guessWhoGame" should "allow user to make hair colour based guesses" in {
    val jonBonesJones: ProjectCharacter = ProjectCharacter(characterName = "Jon Jones", hasGlasses = false, hairColour = "Black", gender = "Male")
    val princessCamilla: ProjectCharacter = ProjectCharacter(characterName = "Princess Camilla", hasGlasses = true, hairColour = "Blonde", gender = "Female")
    val nedStark: ProjectCharacter = ProjectCharacter(characterName = "Ned Stark", hasGlasses = false, hairColour = "Brown", gender = "Male")

    val charactersList: List[ProjectCharacter] = List(jonBonesJones, princessCamilla, nedStark)

    val guessOne: (String, String) = ("hairColour", "Blonde")

    val guessList: List[(String, String)] = List(guessOne)
    assert(finalPracticalMain.areTheyString(charactersList, guessList, nedStark).length === 2)
  }

  "guessWhoGame" should "allow user to make gender based guesses" in {
    val jonBonesJones: ProjectCharacter = ProjectCharacter(characterName = "Jon Jones", hasGlasses = false, hairColour = "Black", gender = "Male")
    val princessCamilla: ProjectCharacter = ProjectCharacter(characterName = "Princess Camilla", hasGlasses = true, hairColour = "Blonde", gender = "Female")
    val nedStark: ProjectCharacter = ProjectCharacter(characterName = "Ned Stark", hasGlasses = false, hairColour = "Brown", gender = "Male")

    val charactersList: List[ProjectCharacter] = List(jonBonesJones, princessCamilla, nedStark)

    val guessOne: (String, String) = ("gender", "Female")

    val guessList: List[(String, String)] = List(guessOne)
    assert(finalPracticalMain.areTheyString(charactersList, guessList, nedStark).length === 2)
  }

  "guessWhoGame" should "allow user to make two guesses" in {
    val jonBonesJones: ProjectCharacter = ProjectCharacter(characterName = "Jon Jones", hasGlasses = false, hairColour = "Black", gender = "Male")
    val princessCamilla: ProjectCharacter = ProjectCharacter(characterName = "Princess Camilla", hasGlasses = true, hairColour = "Blonde", gender = "Female")
    val nedStark: ProjectCharacter = ProjectCharacter(characterName = "Ned Stark", hasGlasses = false, hairColour = "Brown", gender = "Male")

    val charactersList: List[ProjectCharacter] = List(jonBonesJones, princessCamilla, nedStark)

    val guessOne: (String, String) = ("gender", "Female")
    val guessTwo: (String, String) = ("hairColour", "Black")

    val guessList: List[(String, String)] = List(guessOne, guessTwo)
    assert(finalPracticalMain.areTheyString(charactersList, guessList, nedStark).length === 1)
  }

  "guessWhoGame" should "return true when a correct final guess is made" in {
    val jonBonesJones: ProjectCharacter = ProjectCharacter(characterName = "Jon Jones", hasGlasses = false, hairColour = "Black", gender = "Male")

    val finalGuess: String = "Jon Jones"

    assert(finalPracticalMain.makeFinalGuess(finalGuess, jonBonesJones) === true)
  }

  "guessWhoGame" should "return false when an incorrect final guess is made" in {
    val jonBonesJones: ProjectCharacter = ProjectCharacter(characterName = "Jon Jones", hasGlasses = false, hairColour = "Black", gender = "Male")

    val finalGuess: String = "Ned Stark"

    assert(finalPracticalMain.makeFinalGuess(finalGuess, jonBonesJones) === false)
  }
}
