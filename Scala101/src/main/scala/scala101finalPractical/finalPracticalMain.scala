package simon.drugan.mercator
package scala101finalPractical

import scala.util.Random

class finalPracticalMain {

  val random = new Random

  def randomCharacter(charactersList: List[ProjectCharacter]): ProjectCharacter = {
    val lengthList: Int = charactersList.length
    val randomIndex: Int = random.nextInt(lengthList)
    val randomCharacter: ProjectCharacter = charactersList( randomIndex )
    randomCharacter
  }

  def makeFinalGuess(name: String, randomCharacter: ProjectCharacter): Boolean = {
    if ( randomCharacter.characterName == name) {
      println("You WIN!")
      true
    } else {
      println("You guessed wrong :(")
      false
    }
  }

  def areTheyBoolean(charactersList: List[ProjectCharacter], guesses: List[(String, Boolean)], character: ProjectCharacter): List[ProjectCharacter] = {
    var additiveList: List[ProjectCharacter] = charactersList
    if ( guesses.nonEmpty ) {
      for (guess <- guesses) yield {
        if (guess._1 == "hasGlasses") {
          if (guess._2 == character.hasGlasses) {
            val filteredCharacterList: List[ProjectCharacter] = charactersList.filter {
              _.hasGlasses == character.hasGlasses
            }
            println("Your guess is CORRECT! Some options have been eliminated!")
            additiveList = filteredCharacterList
            additiveList
          } else {
            val filteredCharacterList = charactersList.filter {
              _.hasGlasses == character.hasGlasses
            }
            println("Your guess is INCORRECT! Some options have been eliminated!")
            additiveList = filteredCharacterList
            additiveList
          }
        } else {
          additiveList
        }
      }
      additiveList
    } else {
      additiveList
    }
  }

  def areTheyString(charactersList: List[ProjectCharacter], guesses: List[(String, String)], character: ProjectCharacter): List[ProjectCharacter] = {
    var additiveList: List[ProjectCharacter] = charactersList
    if (guesses.nonEmpty) {
      for (guess <- guesses) yield {
        if (guess._1 == "hairColour") {
          if (guess._2 == character.hairColour) {
            val filteredCharacterList: List[ProjectCharacter] = additiveList.filter {
              _.hairColour == character.hairColour
            }
            println("Your guess is CORRECT! Some options have been eliminated!")
            additiveList = filteredCharacterList
            additiveList
          } else {
            val filteredCharacterList = additiveList.filter {
              _.hairColour != guess._2
            }
            println("Your guess is INCORRECT! Some options have been eliminated!")
            additiveList = filteredCharacterList
            additiveList
          }
        } else if (guess._1 == "gender") {
          if (guess._2 == character.gender) {
            val filteredCharacterList: List[ProjectCharacter] = additiveList.filter {
              _.gender == character.gender
            }
            println("Your guess is CORRECT! Some options have been eliminated!")
            additiveList = filteredCharacterList
            additiveList
          } else {
            val filteredCharacterList = additiveList.filter {
              _.gender == character.gender
            }
            println("Your guess is INCORRECT! Some options have been eliminated!")
            additiveList = filteredCharacterList
            additiveList
          }
        } else {
          additiveList
        }
      }
      additiveList
    } else {
      additiveList
    }
  }
}

