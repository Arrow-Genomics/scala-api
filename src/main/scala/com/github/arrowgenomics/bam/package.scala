package com.github.arrowgenomics

import java.io.File

package object bam {
  type Field

  type Result

  def loadBam(file: File): Result = ???

  def loadBamFields(file: File, fields: List[Field]): Result = ???

  def loadBamRegion(file: File, contig: String, start: Int, stop: Int): Result = ???

  def loadBamRegionField(file: File, contig: String, start: Int, stop: Int, fields: List[Field]): Result = ???

  def loadBamBlocks(file: File, start: Long, stop: Long): Result = ???

  def loadBamBlocksField(file: File, start: Long, stop: Long, fields: List[Field]): Result = ???

  def writeBam(data: Result, file: File): Unit = ???

  def filterBam(data:Result): Result = ???

}
