<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<jsp:include page="../global/header.jsp"></jsp:include>

<div class="container">
    <h1>View Profile</h1>
  	<hr>
	<div class="row">
      <div class="col-md-6 personal-info">
        <form class="form-horizontal" role="form">
          <div class="form-group">
          	<label class="col-lg-3 control-label">Employee Id : </label>
            <label class="col-lg-3 control-label">${personalDetail.getEmp_id()}</label>
          </div>
          <div class="form-group">
          <label class="col-lg-3 control-label">First Name : </label>
            <label class="col-lg-3 control-label">${personalDetail.getFirstName()}</label>
          </div>
          <div class="form-group">
          <label class="col-lg-3 control-label">Middle Name : </label>
            <label class="col-lg-3 control-label">${personalDetail.getMiddleName()}</label>
          </div>
          <div class="form-group">
          <label class="col-lg-3 control-label">Last Name : </label>
            <label class="col-lg-3 control-label">${personalDetail.getLastName()}</label>
          </div>
          <div class="form-group">
          <label class="col-lg-3 control-label">Gender : </label>
            <label class="col-lg-3 control-label">${personalDetail.getGender()}</label>
          </div>
          <div class="form-group">
          <label class="col-lg-3 control-label">Date Of Birth : </label>
            <label class="col-lg-3 control-label">${personalDetail.getDob()}</label>
          </div>
          <div class="form-group">
          <label class="col-lg-3 control-label">Place Of Birth : </label>
            <label class="col-lg-3 control-label">${personalDetail.getPlaceOfBirth()}</label>
          </div>
          <div class="form-group">
          <label class="col-lg-3 control-label">Blood Group : </label>
            <label class="col-lg-3 control-label">${personalDetail.getBloodGroup()}</label>
          </div>       
          <div class="form-group">
          <label class="col-lg-3 control-label">Resume : </label>
            <label class="col-lg-3 control-label"><a href="${personalDetail.getResume()}">Resume</a></label>
          </div>   
        </form>
      </div>
      
      <div class="col-md-5 thumbnail">
            <img src="data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAASwAAADICAYAAABS39xVAAAEsElEQVR4nO3bMVLjSABA0bn/UQgdOXLixKEP4DPoCjORqtqihakaWPZrXvASaCQZSr+6RevXsiy/AQp+/fQFAHyWYAEZggVkCBaQIVhAhmABGYIFZAgWkCFYQIZgARmCBWQIFpAhWECGYAEZggVkCBaQIVhAhmABGYIFZAgWkCFYQIZgARmCBWQIFpAhWECGYAEZggVkCBaQIVhAhmABGYIFZAgWkCFYQIZgARmCBWQIFpAhWECGYAEZggVkCBaQIVhAhmABGYIFZAgWkCFYQIZgARmCBWQIFpAhWECGYAEZggVkCBaQIVhAhmABGYIFZAgWkCFYQIZgARmCBWQIFpAhWECGYAEZggVkCBaQIVhAhmABGYIFZAgWkCFYQIZgARmCBWQIFpAhWECGYAEZggVkCBaQIVhAhmABGYIFZAgWkCFYQIZgARmCBWQIFpAhWECGYAEZggVkCBaQIVhAhmABGYJ1MG9vb0/u9/t03P1+fxp3Op12j3k+n5/G3m63v77O0+n06fNvP9Pj8ZiOu16vT+Mul8uP/z34WoJ1EI/H492Nvbper09jb7fb7tjtcbdh2TvmV1znNkYfjd2G+HK5TMedz+cf/9vwdQTrIMYbdr3px5nROHaN0Hgzz2YlY9jWQIyzmL2Zzmevcz3mGKbx/OPY9WvrZxpnZOPPryEdZ5BfMSPk/0GwDmIWodkNP97I4yxlHTuGYI3DeMwxDmsIxrCNwRnjtoZkdp3jucbzz2Zz47nWYI7nmf1OLA2PQ7AObLYs2pshzUKw9yxoFoJx6fh4PJ7C9tHzqdU2WHszpFkwZ7FblnmEaROsAxqjtHcTb2cj2+XfbJm1ms2SxsBcLpen5ejeg//Zz67HnC1Hl2W+/Nubte19VroE64C2D6BnS7+vDtbsvJ9djo3jZ8tMwWIlWAc2zrTWm/47g7Us77cgvLrGvf/oCRYzgnVw25nOdwdrPP6r2dUYq+3SVbCYEayD28bjux66L8v7zagfPb96NRPz0J0ZwTqA8eYeZ0Oz/U3fsa1hNdtkOovFdtze55p9Jtsa/m2CdRCzAMw2aY5jX20cnT0D25uhjV+/3W7TPVjbca+WarONr7PZ1CzYNo4ek2AdxEev23z3qzl7e662e7M+Ot7sGryaw5ZgHcjsBv8vXn7e23O13V/16j3CvWhuv+/l53+XYAEZggVkCBaQIVhAhmABGYIFZAgWkCFYQIZgARmCBWQIFpAhWECGYAEZggVkCBaQIVhAhmABGYIFZAgWkCFYQIZgARmCBWQIFpAhWECGYAEZggVkCBaQIVhAhmABGYIFZAgWkCFYQIZgARmCBWQIFpAhWECGYAEZggVkCBaQIVhAhmABGYIFZAgWkCFYQIZgARmCBWQIFpAhWECGYAEZggVkCBaQIVhAhmABGYIFZAgWkCFYQIZgARmCBWQIFpAhWECGYAEZggVkCBaQIVhAhmABGYIFZAgWkCFYQIZgARmCBWQIFpAhWECGYAEZggVkCBaQIVhAhmABGYIFZAgWkCFYQIZgARmCBWQIFpAhWECGYAEZggVkCBaQIVhAhmABGYIFZAgWkCFYQIZgARmCBWQIFpDxB2bVxDz7FuNBAAAAAElFTkSuQmCC" alt="300x200" data-src="holder.js/300x200" style="">
      </div>
  </div>
</div>
<hr>

	
<jsp:include page="../global/footer.jsp"></jsp:include>