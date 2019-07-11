import org.apache.spark.rdd.RDD
import org.apache.spark.{SparkConf, SparkContext}

object Start {

  val conf = new SparkConf().setMaster("local").setAppName("StudentExamPerformance")
  val context = new SparkContext(conf)
  val data = context.textFile("..\\StudentPerformanceExamAnalysis\\StudentsPerformance.csv")


  def getData(): RDD[String] = data
}
