package com.example.demo.animalsAPI.repository;

import java.io.IOException;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;

import com.example.demo.animalsAPI.data.AnimalData;
import com.fasterxml.jackson.databind.ObjectMapper;

@Repository
public class AnimalRepository {
	public AnimalData[] getAnimalData() throws IOException {
		//APIのアドレス
		String url = "https://wsaz0e6z45.execute-api.ap-northeast-1.amazonaws.com/prod/animalsAPI";
		//HTTPリクエストを送信する為のクラス
		//サーバーとの間でデータを送受信する為に使用
		RestTemplate rest = new RestTemplate();
		//getForEntity：HTTP GETメソッドを送信し、レスポンスを取得するメソッド
		//ResponseEntity：HTTPレスポンス全体を表す
		ResponseEntity<String> response = rest.getForEntity(url, String.class);
		//getBody：HTTPレスポンスのボディ部分を取得
		String json = response.getBody();
		//JSONデータとJavaオブジェクトの相互変換を行うクラス
		ObjectMapper mapper = new ObjectMapper();
		//JSON文字列をクラスの配列にデシリアライズをする
		//readValue：JSONをJavaオブジェクトに変換するメソッド
		AnimalData[] animalsList = mapper.readValue(json, AnimalData[].class);

		return animalsList;
	}

	public AnimalData[] getAnimalDetail(int id) throws IOException {
		//APIのアドレス
		String url = "https://wsaz0e6z45.execute-api.ap-northeast-1.amazonaws.com/prod/animalsAPI?id=" + id;
		//HTTPリクエストを送信する為のクラス
		//サーバーとの間でデータを送受信する為に使用
		RestTemplate rest = new RestTemplate();
		//getForEntity：HTTP GETメソッドを送信し、レスポンスを取得するメソッド
		//ResponseEntity：HTTPレスポンス全体を表す
		ResponseEntity<String> response = rest.getForEntity(url, String.class);
		//getBody：HTTPレスポンスのボディ部分を取得
		String json = response.getBody();
		//JSONデータとJavaオブジェクトの相互変換を行うクラス
		ObjectMapper mapper = new ObjectMapper();
		//JSON文字列をクラスの配列にデシリアライズをする
		//readValue：JSONをJavaオブジェクトに変換するメソッド
		AnimalData[] animalsList = mapper.readValue(json, AnimalData[].class);
		return animalsList;
	}
}
