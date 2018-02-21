package com.javaEE.manage.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.javaEE.manage.pojo.YuTest;
import com.javaEE.manage.service.YuTestService;

@RequestMapping("content/yuTest")
@Controller
public class YuTestController {
	
	
		@Autowired
		private YuTestService yuTestService;
		
		/**
		 * 通过URL传值查询yuTest表 如: http://www.yu.com/JavaEEProject/rest/content/yuTest/2
		 * 末尾的2就是id的值
		 * @param pid
		 * @return
		 */
		@RequestMapping(value="{id}",method = RequestMethod.GET)
		public ResponseEntity<List<YuTest>> queryListById(@PathVariable("id") Long id) {
			try {
				YuTest record = new YuTest();
				record.setId(id);
				List<YuTest> list = this.yuTestService.queryListByWhere(record);
				if(null == list || list.isEmpty()) {
					return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
				}
				return ResponseEntity.ok(list);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
		}
		
		
		
		
		/**
		 * 添加记录
		 * @param yuTest
		 * @return
		 */
		@RequestMapping(method = RequestMethod.POST)
		public ResponseEntity<Void> saveContent(YuTest yuTest) {
			try {
				yuTest.setId(null);
				this.yuTestService.save(yuTest);
				return ResponseEntity.status(HttpStatus.CREATED).build();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
		
		
		
		/**
		 * 修改记录内容
		 * @param id
		 * @param name
		 * @return
		 */
		@RequestMapping(method = RequestMethod.PUT)
		public ResponseEntity<Void> rename(@RequestParam("id") Long id, @RequestParam("name") String name) {
			try {
				YuTest yuTest = new YuTest();
				yuTest.setId(id);
				yuTest.setUsername(name);
				this.yuTestService.updateSelective(yuTest);
				return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
		
		
		
		
		
		/**
		 * 删除记录
		 * @param contentCategory
		 * @return
		 */
		@RequestMapping(method = RequestMethod.DELETE)
		public ResponseEntity<Void> delete(@RequestParam("id") Long id) {
			try {
				YuTest yuTest = new YuTest();
				yuTest.setId(id);
				this.yuTestService.deleteByWhere(yuTest);
				
				return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
	
}
