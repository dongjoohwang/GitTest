<!-- inquiry/register -->

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
                           질문 등록
                        </div>
                        <!-- /.panel-heading -->
                        <div class="panel-body">
                           <form role="form" action="/inquiry/register"  method="post">
								<div class="from-group">
									<label>제목</label><input class="form-control"  name="title"  ><br>
								</div>
								<div class="from-group">
									<label>작성자</label><input class="form-control"  name="nickname"  ><br>
								</div>
								<div class="from-group">
									<label>증상</label><input class="form-control"  name="symptom2"  ><br>
								</div>
							    <div class="from-group">
									<label>등록 내용</label><textarea class="form-control"   rows="3"  name="text"></textarea><br>
								</div>
							    <button type="submit" class="btn btn-default">등록</button>
							    <button type="reset" class="btn btn-default">다시 쓰기</button>
                           </form>
                        </div>
                        <!-- /.panel-body -->
                    </div>
                    <!-- /.panel -->
                </div>
                <!-- /.col-lg-12 -->
            </div>
            <!-- /.row -->
            
 <!-- 여기부터 시작............ -->
<!--  <div class="modal" tabindex="-1" role="dialog" id="myModal">
  <div class="modal-dialog" role="document">
    <div class="modal-content">
      <div class="modal-header">
        <h5 class="modal-title">Modal title</h5>
        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
          <span aria-hidden="true">&times;</span>
        </button>
      </div>
      <div class="modal-body">
        처리가 완료되었습니다.
      </div>
      <div class="modal-footer">
        <button type="button" class="btn btn-primary">Save changes</button>
        <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
      </div>
    </div>
  </div>
</div>
 -->
 <!-- <script>
 	$(document).ready(function(){
 		var result = '<c:out value="${result}" />'
 		
 		checkModal(result);
 		function checkModal(result){
 			if(result == ' '){
 				return;
 			}
 			if(parseInt(result) > 0 ){
 				$(".modal-body").html("게시글 " + parseInt(result) + " 번이 등록되었습니다.");
 			}
 			$("#myModal").modal("show");
 		}
 		
 		$("#regBtn").on("click", function(){
 			self.location = "/board/register";
 		});
 	});
 </script>    -->
<%@ include file="../includeslist/footer.jsp" %>
