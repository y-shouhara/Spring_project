package com.example.demo.animalsAPI.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.animalsAPI.data.AnimalData;
import com.example.demo.animalsAPI.service.AnimalService;

@Controller
public class AnimalController {
	//参照先のServiceクラス定数を生成
	private final AnimalService animalService;

	//コンストラクタでServiceクラス定数に値を設定
	public AnimalController(AnimalService animalService) {
		this.animalService = animalService;
	}

	@GetMapping("animalSearch")
	public String getAnimalSearch(Model model) throws IOException {
		List<AnimalData> animalDatasList = animalService.getAnimalDatas();
		model.addAttribute("animalDatasList", animalDatasList);
		return "animal-search.html";
	}

	@GetMapping("animalDetail")
	public String getAnimalSearch(@RequestParam("id") int id, Model model) throws IOException {
		List<AnimalData> animalDatasList = animalService.getAnimalDetail(id);
		model.addAttribute("animalDatasList", animalDatasList);
		return "animal-detail.html";
	}

}
