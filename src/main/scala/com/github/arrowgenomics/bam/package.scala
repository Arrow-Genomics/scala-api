package com.github.arrowgenomics

import java.io.File

package object bam {
  def loadBam(file: File) = ???

  def loadBamRegion(file: File, contig: String, start: Int, stop: Int) = ???
}
