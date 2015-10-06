package com.java.practice;

import java.util.Locale;
import java.util.ResourceBundle;




public class trans_bundle {

	public trans_bundle() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		readresourse();

	}

	



		static void readresourse()
		{
			ResourceBundle bundle = ResourceBundle.getBundle("lang", Locale.getDefault());
			System.out.println(bundle.getString("sentence_eng") + "eng sentence");
			bundle=ResourceBundle.getBundle("lang", Locale.FRANCE);
			System.out.println(bundle.getString("sentence_french") + "  french sentence");

		}
	}

