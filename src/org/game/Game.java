package org.game;

import java.util.Random;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

public class Game extends Activity {
	
	private static final String TAG = "Sudoku";
	
	public static final String KEY_DIFFICULTY = "org.game.sudoku.difficulty";
	
	public static final int DIFFUCULTY_EASY = 0;
	public static final int DIFFUCULTY_MEDIUM = 1;
	public static final int DIFFUCULTY_HARD = 2;
	
	private int puzzle[] = new int[9*9];
	
	private PuzzleView puzzleView;
	
	private Random random = new Random();
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		Log.d(TAG, "onCreate");
		int diff = getIntent().getIntExtra(KEY_DIFFICULTY, DIFFUCULTY_EASY);
//		puzzle = getPuzzle(diff);
//		calculateUsedTiles();
		puzzleView = new PuzzleView(this);
		setContentView(puzzleView);
		puzzleView.requestFocus();
	}
	
	public String getTileString(int i, int j){
		return String.valueOf(random.nextInt(10));
	}
	

}
