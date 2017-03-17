package io.buildo.sandbox.slogo
package log4j2

import java.util.UUID
import java.time.Instant
import java.nio.charset.StandardCharsets
import org.apache.logging.log4j.core.LogEvent
import org.apache.logging.log4j.core.layout.AbstractStringLayout
import org.apache.logging.log4j.core.config.plugins.{ Plugin, PluginFactory }

@Plugin(name = "SlogoLayout", category = "Core", elementType = "layout", printObject = false)
class SlogoLayout extends AbstractStringLayout(StandardCharsets.UTF_8) {
  override def toSerializable(e: LogEvent): String = {
    val value = e.toImmutable.getMessage.getFormattedMessage
    val id = UUID.randomUUID.toString
    val createdAt = Instant.now.toString
    s"""{
       |"createdAt": "$createdAt",
       | "id": "$id",
       | "value": {"message": "$value"}
       |}""".stripMargin.replaceAll("\n", "") + "\n"
  }
}

object SlogoLayout {
  @PluginFactory
  def createLayout(): SlogoLayout = new SlogoLayout
}
