<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Quiz Page</title>
<link rel="stylesheet" href="styles.css" type="text/css">
<link rel="stylesheet" href="css/quiz.css">
</head>
<body>
  <center>
		<a href="/">Home</a>&nbsp;
	</center>
  <!-- QUIZ ONE -->
  <section class="section-1" id="section-1">
      <main>
          <div class="text-container">
              <h3>Pure CSS Quiz</h3>
              <p>QUESTION 1 OF 5</p>
              <p>What does CSS stand for?</p>
          </div>
          <form>
              <div class="quiz-options">
                  <input type="radio" class="input-radio one-a jshdgdgwgdwfdfwdwjfdjwwdwdco" id="one-a" name="yes-1" required>
                  <label class="radio-label jsjwjdwjdwjdwco" for="one-a">
                      <span class="alphabet">A</span> Cascading Style Sheets <img class="icon jdsjkefkefkefefexco" src="https://res.cloudinary.com/dvhndpbun/image/upload/v1588518387/jdsjkefkefkefefexco.svg" alt="">
                  </label>
                  <input type="radio" class="input-radio one-b jshdgdgwgdwfdfwdwjfdjwwdwdin" id="one-b" name="yes-1">
                  <label class="radio-label jsjwjdwjdwjdwin" for="one-b">
                      <span class="alphabet">B</span> Creative Screen Styling <img class="icon jfdedgwfzexf4hjin" src="https://res.cloudinary.com/dvhndpbun/image/upload/v1588517753/jfdedgwfzexf4hjin.svg">
                  </label>
                  <input type="radio" class="input-radio one-c jshdgdgwgdwfdfwdwjfdjwwdwdin" id="one-c" name="yes-1">
                  <label class="radio-label jsjwjdwjdwjdwin" for="one-c">
                      <span class="alphabet">C</span> Cascading Style Screen <img class="icon jfdedgwfzexf4hjin" src="https://res.cloudinary.com/dvhndpbun/image/upload/v1588517753/jfdedgwfzexf4hjin.svg">
                  </label>
              </div>
              <a id="btn" type="submit" onclick="window.location.href='#section-2'">Next</a>
          </form>
      </main>
  </section>


  <div class="score-counter">
      <p class="score-text">CORRECT:</p>
  </div>

</body>
</html>