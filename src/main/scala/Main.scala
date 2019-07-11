object Main {
  def main(args: Array[String]): Unit = {
    println(BestPerformanceStudentsFilter.bestPerformanceStudents.count()+" students")
    BestPerformanceStudentsFilter.bestPerformanceStudents.foreach(f => {
      println(f.gender + " " + f.ethnicity + " " + f.education + " " + f.mathScore + " " + f.readingScore + " " + f.writingScore)
    })
/*
    GenderPercent.setRdd(BestPerformanceStudentsFilter.getBestPerformanceStudents())
    GenderPercent.getPercent()
    EthnicityPercent.setRdd(BestPerformanceStudentsFilter.getBestPerformanceStudents())
    EthnicityPercent.getPercent()*/
    GenderPercent.setRdd(AllStudentFilter.getStudents())
    GenderPercent.getPercent()
    EthnicityPercent.setRdd(AllStudentFilter.getStudents())
    EthnicityPercent.getPercent()
  }
}
