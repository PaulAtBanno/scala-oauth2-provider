package scalaoidc.provider

import scalaoauth2.provider._

class OIDCTokenEndpoint extends TokenEndpoint {
  override def handlers = super.handlers.updated("authorization_code", new OIDCTokenRequest(fetcher))
}

object OIDCTokenEndpoint extends OIDCTokenEndpoint