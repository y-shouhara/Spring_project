package com.example.demo.animalsAPI.service;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.animalsAPI.data.AnimalData;
import com.example.demo.animalsAPI.repository.AnimalRepository;

@Service
public class AnimalService {
	//参照先のRepositoryクラス定数を生成
	private final AnimalRepository animalRepository;

	//コンストラクタでRepositoryクラス定数に値を設定
	public AnimalService(AnimalRepository animalRepository) {
		this.animalRepository = animalRepository;
	}

	//コントローラーから呼び出されるメソッド
	public List<AnimalData> getAnimalDatas() throws IOException {
		//Repository.getAnimalDataから配列型のデータを取得
		AnimalData[] animalDataList = animalRepository.getAnimalData();
		//配列型をArrayList型に変換してリターン
		//Arrays.asList(配列)
		return Arrays.asList(animalDataList);
	}

	public List<AnimalData> getAnimalDetail(int id) throws IOException {
		AnimalData[] animalDataList = animalRepository.getAnimalDetail(id);
		return Arrays.asList(animalDataList);
	}
}
