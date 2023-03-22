package model

import play.api.libs.json.{Json, OFormat}

case class GithubFile(name: String,
                      `type`: String,
                      content: String)

object GithubFile {
  implicit val format: OFormat[GithubFile] = Json.format[GithubFile]
}