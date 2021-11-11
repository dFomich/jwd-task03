package by.epam.tr.jwd.main;

import java.util.List;

public class Main {

	public static void main(String[] args) {
		String expressionText = "1422 - 34 - 3* (5 + 5* (3 - 2)) * 2";
		LexAnalyze lexAn = new LexAnalyze();
		List<Lexeme> lexemes = lexAn.lexAnalyze(expressionText);
		LexemeBuffer lexemeBuffer = new LexemeBuffer(lexemes);
		Calc calc = new Calc();
		System.out.println(calc.expr(lexemeBuffer));
	}

}