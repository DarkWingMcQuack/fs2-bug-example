package example

import cats.effect.IO
import fs2.Stream
import cats.effect.IOApp
import cats.effect.ExitCode

object Hello extends IOApp {

  def run(args: List[String]): IO[ExitCode] =
    Stream
      .emits(1 to 1000)
      .covary[IO]
      .evalTap(dp => IO.println(f"before slide: $dp"))
      .sliding(50)
      .evalTap(ch => IO.println(f"sliding: ${ch}"))
      .compile
      .drain
      .as(ExitCode.Success)
}
