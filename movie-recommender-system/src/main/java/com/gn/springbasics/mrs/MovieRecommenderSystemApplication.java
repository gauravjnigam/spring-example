package com.gn.springbasics.mrs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Arrays;

@SpringBootApplication
public class MovieRecommenderSystemApplication {

	public static void main(String[] args) {

		//SpringApplication.run(MovieRecommenderSystemApplication.class, args);

		//create object of RecommenderImplementation class
//		RecommenderImplementation recommender = new RecommenderImplementation();
/* 		-> code without spring
		//passing name of the filter as constructor argument
		//code is now loosely coupled as we are passing the name of the filter to be used as a constructor argument.
		RecommenderImplementation recommender = new RecommenderImplementation(new ContentBasedFilter());
		//call method to get recommendations
		String[] result = recommender.recommendMovies("Finding Dory");

 */
		ApplicationContext appContext = SpringApplication.run(MovieRecommenderSystemApplication.class, args);

		RecommenderImplementation recommender = appContext.getBean(RecommenderImplementation.class);

		String[] result = recommender.recommendMovies("ABC");



		//display results
		System.out.println(Arrays.toString(result));

	}

}
