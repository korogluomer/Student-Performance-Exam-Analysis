class Member(var gender: String,
             var ethnicity: String,
             var education: String,
             var lunch: String,
             var preparationCourse: String,
             var mathScore: Int,
             var readingScore: Int,
             var writingScore: Int) extends Serializable {

  def getGender(): String = gender

  def getEthnicity(): String = ethnicity

  def getEducation(): String = education

  def getLunch(): String = lunch

  def getPreparationCourse(): String = preparationCourse

  def getMathScore(): Int = mathScore

  def getReadingScore(): Int = readingScore

  def getWritingScore(): Int = writingScore

  def setGender(s: String) = (gender = s)

  def setEthnicity(s: String) = (ethnicity = s)

  def setEducation(s: String) = (education = s)

  def setLunch(s: String) = (lunch = s)

  def setPreparationCourse(s: String) = (preparationCourse = s)

  def setMathScore(s: Int) = (mathScore = s)

  def setReadingScore(s: Int) = (readingScore = s)

  def setWritingScore(s: Int) = (writingScore = s)
}

//gender,race/ethnicity,parental level of education,lunch,test preparation course,math score,reading score,writing score