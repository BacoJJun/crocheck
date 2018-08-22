<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="./head.jsp" %>
<div class="container" id="home-content">
  <div class="row">
    <div class="col-md-3 chart section" id="cpu-section">
      <h3 class="home-section-title">CPU <small class="section-sub-title">Usage</small></h3>
      <div id="c3-cpu-chart"></div>
    </div>
    <div class="col-md-3 chart section">
      <h3 class="home-section-title">Memory <small class="section-sub-title">Usage</small></h3>
      <div id="c3-memory-chart"></div>
    </div>
    <div class="col-md-3 chart section">
      <h3 class="home-section-title">Disk <small class="section-sub-title">Usage</small></h3>
      <div id="c3-disk-chart"></div>
    </div>
    <div class="col-md-3 chart section">
      <h3 class="home-section-title">Network <small class="section-sub-title">Monitoring</small></h3>
      <div id="c3-packet-chart"></div>
    </div>
  </div>
  <div class="row">
    <div class="au-card recent-report ">
	<div class="au-card-inner">
      <h3 class="home-section-title">Packet <small class="section-sub-title">Detection</small></h3>
      <div class="recent-reprt__chart" id="c3-network-chart"></div>
	</div>
    </div>
    <div class="col-md-9 padding-zero">
      <div class="col-md-6 section list" id="pharming-list">
        <h3 class="home-section-title">파밍공격 <small class="section-sub-title">(Domain) Top lists</small></h3>
        <div class="cell-explain">
          <label class="abnormal">파밍</label>
          <label class="normal">파밍의심</label>
          </div>
          <form name="goLink" style="padding: : 0; margin: 0;">
          <input type="hidden" value="" name="search">
          <input type="hidden" value="" name="seq">
          <input type="hidden" value="" name="gubun">
          </form>
    		<table class="table table-hover">
      		<thead>
      			<TR>
      			<th class="col-xs-9">
        			Domain
      			</th>
      			<th class="col-xs-3">
        			횟수
      			</th>
      		</thead>
      		<tbody>
      		<TR>
            <td></td>
            <td></td>
          </tr>
      </tbody>
    </table>
   </div>
      <div class="col-md-6 section list" id="pharming-client-list">
        <h3 class="home-section-title">파밍공격 <small class="section-sub-title">(클라이언트) Top lists</small></h3>
        <div class="cell-explain">
          <label class="abnormal">파밍</label>
          <label class="normal">파밍의심</label>
        </div>
          <form name="goLinks" style="padding: : 0; margin: 0;">
          <input type="hidden" value="" name="search">
          <input type="hidden" value="" name="seq">
          <input type="hidden" value="" name="gubun">
          </form>
    <table class="table table-hover">
      <thead>
      <TR>
      <th>Departure</th>
      <th class="balance">횟수</th>
      </thead>
      <tbody>
      </tbody>
    </table>
      </div>
    </div>
  </div>
</div>
