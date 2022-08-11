<!-- inquiry/get -->

<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<%@include file="../includeslist/header.jsp" %>

            <div class="row">
                <div class="col-lg-12">
                    <h1 class="page-header">무엇이든 물어보세요</h1>
                </div>
                <!-- /.col-lg-12 -->
            </div>
            <!-- /.row -->
            <div class="row">
                <div class="col-lg-12">
                    <div class="panel panel-default">
                        <div class="panel-heading">
                           등록글
                        </div>
                        <!-- /.panel-heading -->
                        <div class="panel-body">
							<div class="from-group">
								<label>번호</label>
								<input class="form-control"  name="bno"  readonly="readonly"  value='<c:out value="${inquiry.bno}"/>' ><br>
							</div>
							<div class="from-group">
								<label>제목</label>
								<input class="form-control"  name="title"  readonly="readonly" value='<c:out value="${inquiry.title}"/>' ><br>
							</div>
							<div class="from-group">
								<label>작성자</label>
								<input class="form-control"  name="nickname"  readonly="readonly" value='<c:out value="${inquiry.nickname}"/>' ><br>
							</div>
							<div class="from-group">
								<label>증상</label>
								<input class="form-control"  name="symptom2"  readonly="readonly" value='<c:out value="${inquiry.symptom2}"/>' ><br>
							</div>
							<div class="from-group">
								<label>등록 내용</label>
								<textarea class="form-control"   rows="3"  name="text"  readonly="readonly"><c:out value="${inquiry.text}"/></textarea><br>
							</div>
							<div class="from-group">
								<label>등록 시간</label>
								<input class="form-control"  name="regdate"  readonly="readonly" value='<fmt:formatDate pattern="yyyy-MM-dd" value="${inquiry.regdate }" />' ><br>
							</div>
							
							 <button data-oper='modify' class="btn btn-default">글 수정</button>
						    <button data-oper='list'  class="btn btn-info" >목록으로 돌아가기</button>
						   
						    
						    <!-- 7/20 -->
						    <form id='operForm'  action = "/inquiry/modify" method="get">
						    	<input type="hidden"  id="bno"  name="bno"  value='<c:out value="${inquiry.bno }"/>' >
						    			<!-- Criteria 클래스의 인스턴스 명과 일치 => 자동 바인딩 -->
						  		<input type="hidden" name="pageNum" value='<c:out value="${cri.pageNum}"/>'>
						    	<input type="hidden" name="amount" value='<c:out value="${cri.amount}"/>'>
						    	<input type="hidden" name="type" value='<c:out value="${cri.type}"/>'>
						    	<input type="hidden" name="keyword" value='<c:out value="${cri.keyword}"/>'>
						    </form>
						   
                        </div>
                        <!-- /.panel-body -->
                    </div>
                    <!-- /.panel -->
                </div>
                <!-- /.col-lg-12 -->
            </div>
            <!-- /.row -->
            
  <script>
  		var operForm = $("#operForm");
  		
  		$("button[data-oper='modify']").on("click", function(e){
  			operForm.attr("action", "/inquiry/modify").submit();
  		});
  		$("button[data-oper='list']").on("click", function(e){	// button[data-oper=' list']	=> 띄어쓰기도 에러로 인식
  			operForm.find("bno").remove();
  			operForm.attr("action", "/inquiry/list").submit();
  		});
  		
  </script>       
  
  
  
  
  
  
  
  
  
  
   
 <%@ include file="../includeslist/footer.jsp" %>