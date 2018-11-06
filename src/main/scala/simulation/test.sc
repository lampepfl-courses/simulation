// Note: "Run this worksheet" does not recompile other files in this project,
// if you modify other files, run "~compile" in sbt
import simulation._

object sim extends Circuits with Parameters

import sim._

val in1, in2, sum, carry = new Wire

halfAdder(in1, in2, sum, carry)
probe("sum", sum)
probe("carry", carry)

in1 setSignal true
run()
in2 setSignal true
run()
