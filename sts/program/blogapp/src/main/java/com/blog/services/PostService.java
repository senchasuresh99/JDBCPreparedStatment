package com.blog.services;

import java.util.List;

import javax.validation.Valid;

import com.blog.dto.PostDto;

public interface PostService {
	List<PostDto> findAllPosts();

	void createPost(PostDto postDto);

	PostDto findPostById(Long postId);

	void updatePost(@Valid PostDto post);

	void deletePost(Long postId);

	PostDto findPostByUrl(String postUrl);

	List<PostDto> searchPosts(String query);
}
