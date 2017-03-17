package io.buildo.sandbox.slogo

import java.time.Instant
import java.util.UUID
import org.apache.logging.log4j.{ LogManager, MarkerManager }

object POC extends App with Log4j2Logging {
  log.info("lorem ipsum")
  log.info("繰り返し € ànd poop 💩\"")
  log.info("lorem ipsum lorem ipsum lorem ipsumlorem ipsum lorem ipsum lorem ipsumlorem ipsum lorem ipsum lorem ipsumlorem ipsum lorem ipsum lorem ipsumlorem ipsum lorem ipsum lorem ipsumlorem ipsum lorem ipsum lorem ipsumlorem ipsum lorem ipsum lorem ipsumlorem ipsum lorem ipsum lorem ipsumlorem ipsum lorem ipsum lorem ipsum")
  log.warn(new Exception("not so important exception"))
  log.error(new Exception("server is broken"))
}

trait Log4j2Logging {
  val log = LogManager.getLogger
}
