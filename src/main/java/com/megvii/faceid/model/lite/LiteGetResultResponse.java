package com.megvii.faceid.model.lite;

import com.google.gson.annotations.SerializedName;
import com.megvii.faceid.model.base.response.BaseResponse;
import com.megvii.faceid.model.base.response.CompareResponse;
import com.megvii.faceid.model.base.common.FaceGenuineness;
import com.megvii.faceid.model.base.common.IdcardDict;
import com.megvii.faceid.model.base.common.ImageList;
import com.megvii.faceid.model.base.common.Result;
import com.megvii.faceid.model.ocr.idcard.v1.IdCardV1Response;
import com.megvii.faceid.util.Const;

public class LiteGetResultResponse extends BaseResponse
{
    private String status;
    @SerializedName(Const.API_PARAM_BIZ_INFO)
    private BizInfo bizInfo;
    @SerializedName(Const.API_PARAM_IDCARD_INFO)
    private IdcardInfo idcardInfo;
    @SerializedName(Const.API_PARAM_LIVENESS_RESULT)
    private LivenessResult livenessResult;
    @SerializedName(Const.API_PARAM_VERIFY_RESULT)
    private VerifyResult verifyResult;
    private ImageList images;

    public String getStatus()
    {
        return status;
    }

    public void setStatus(String status)
    {
        this.status = status;
    }

    public BizInfo getBizInfo()
    {
        return bizInfo;
    }

    public void setBizInfo(BizInfo bizInfo)
    {
        this.bizInfo = bizInfo;
    }

    public IdcardInfo getIdcardInfo()
    {
        return idcardInfo;
    }

    public void setIdcardInfo(IdcardInfo idcardInfo)
    {
        this.idcardInfo = idcardInfo;
    }

    public LivenessResult getLivenessResult()
    {
        return livenessResult;
    }

    public void setLivenessResult(LivenessResult livenessResult)
    {
        this.livenessResult = livenessResult;
    }

    public VerifyResult getVerifyResult()
    {
        return verifyResult;
    }

    public void setVerifyResult(VerifyResult verifyResult)
    {
        this.verifyResult = verifyResult;
    }

    public ImageList getImages()
    {
        return images;
    }

    public void setImages(ImageList images)
    {
        this.images = images;
    }

    public static class BizInfo
    {
        @SerializedName(Const.API_PARAM_BIZ_ID)
        private String bizId;
        @SerializedName(Const.API_PARAM_BIZ_NO)
        private String bizNo;
        @SerializedName(Const.API_PARAM_BIZ_EXTRA_DATA)
        private String bizExtraData;

        public String getBizId()
        {
            return bizId;
        }

        public void setBizId(String bizId)
        {
            this.bizId = bizId;
        }

        public String getBizNo()
        {
            return bizNo;
        }

        public void setBizNo(String bizNo)
        {
            this.bizNo = bizNo;
        }

        public String getBizExtraData()
        {
            return bizExtraData;
        }

        public void setBizExtraData(String bizExtraData)
        {
            this.bizExtraData = bizExtraData;
        }
    }

    public static class IdcardInfo
    {
        @SerializedName(Const.API_PARAM_IDCARD_MODE)
        private String idcardMode;
        @SerializedName(Const.API_PARAM_IDCARD_UNEDITABLE_FIELD)
        private String idcardUnEditableField;
        @SerializedName(Const.API_PARAM_IDCARD_MODE_USER)
        private String idcardModeUser;
        @SerializedName(Const.API_PARAM_IDCARD_NUMBER)
        private String idcardNumber;
        @SerializedName(Const.API_PARAM_IDCARD_NAME)
        private String idcardName;
        @SerializedName(Const.API_PARAM_IDCARD_VALID_DATE)
        private String idcardValidDate;
        @SerializedName(Const.API_PARAM_IDCARD_ISSUED_BY)
        private String idcardIssuedBy;
        @SerializedName(Const.API_PARAM_FRONT_SIDE)
        private IdcardSide frontSide;
        @SerializedName(Const.API_PARAM_BACK_SIDE)
        private IdcardSide backSide;
        @SerializedName(Const.API_PARAM_OCR_FRONT_QUALITY)
        private IdcardQuality frontQuality;
        @SerializedName(Const.API_PARAM_OCR_BACK_QUALITY)
        private IdcardQuality backQuality;

        public String getIdcardMode()
        {
            return idcardMode;
        }

        public void setIdcardMode(String idcardMode)
        {
            this.idcardMode = idcardMode;
        }

        public String getIdcardUnEditableField()
        {
            return idcardUnEditableField;
        }

        public void setIdcardUnEditableField(String idcardUnEditableField)
        {
            this.idcardUnEditableField = idcardUnEditableField;
        }

        public String getIdcardModeUser()
        {
            return idcardModeUser;
        }

        public void setIdcardModeUser(String idcardModeUser)
        {
            this.idcardModeUser = idcardModeUser;
        }

        public String getIdcardNumber()
        {
            return idcardNumber;
        }

        public void setIdcardNumber(String idcardNumber)
        {
            this.idcardNumber = idcardNumber;
        }

        public String getIdcardName()
        {
            return idcardName;
        }

        public void setIdcardName(String idcardName)
        {
            this.idcardName = idcardName;
        }

        public String getIdcardValidDate()
        {
            return idcardValidDate;
        }

        public void setIdcardValidDate(String idcardValidDate)
        {
            this.idcardValidDate = idcardValidDate;
        }

        public String getIdcardIssuedBy()
        {
            return idcardIssuedBy;
        }

        public void setIdcardIssuedBy(String idcardIssuedBy)
        {
            this.idcardIssuedBy = idcardIssuedBy;
        }

        public IdcardSide getFrontSide()
        {
            return frontSide;
        }

        public void setFrontSide(IdcardSide frontSide)
        {
            this.frontSide = frontSide;
        }

        public IdcardSide getBackSide()
        {
            return backSide;
        }

        public void setBackSide(IdcardSide backSide)
        {
            this.backSide = backSide;
        }

        public IdcardQuality getFrontQuality()
        {
            return frontQuality;
        }

        public void setFrontQuality(IdcardQuality frontQuality)
        {
            this.frontQuality = frontQuality;
        }

        public IdcardQuality getBackQuality()
        {
            return backQuality;
        }

        public void setBackQuality(IdcardQuality backQuality)
        {
            this.backQuality = backQuality;
        }
    }

    public static class IdcardSide
    {
        @SerializedName(Const.API_PARAM_OCR_RESULT)
        private IdCardV1Response ocrResult;
        @SerializedName(Const.API_PARAM_UPLOAD_TIMES_LOWERCASE)
        private int uploadTimes;

        public IdCardV1Response getOcrResult()
        {
            return ocrResult;
        }

        public void setOcrResult(IdCardV1Response ocrResult)
        {
            this.ocrResult = ocrResult;
        }

        public int getUploadTimes()
        {
            return uploadTimes;
        }

        public void setUploadTimes(int uploadTimes)
        {
            this.uploadTimes = uploadTimes;
        }
    }

    public static class IdcardQuality
    {
        private IdcardDict name;
        @SerializedName(Const.API_PARAM_IDCARD_NUMBER)
        private IdcardDict idcardNumber;
        private IdcardDict gender;
        @SerializedName(Const.API_PARAM_BIRTH_YEAR)
        private IdcardDict birthYear;
        @SerializedName(Const.API_PARAM_BIRTH_MONTH)
        private IdcardDict birthMonth;
        @SerializedName(Const.API_PARAM_BIRTH_DAY)
        private IdcardDict birthDay;
        private IdcardDict nationality;
        private IdcardDict address;
        @SerializedName(Const.API_PARAM_ISSUED_BY)
        private IdcardDict issuedBy;
        @SerializedName(Const.API_PARAM_VALID_DATE_START)
        private IdcardDict validDateStart;
        @SerializedName(Const.API_PARAM_VALID_DATE_END)
        private IdcardDict validDateEnd;

        public IdcardDict getName()
        {
            return name;
        }

        public void setName(IdcardDict name)
        {
            this.name = name;
        }

        public IdcardDict getIdcardNumber()
        {
            return idcardNumber;
        }

        public void setIdcardNumber(IdcardDict idcardNumber)
        {
            this.idcardNumber = idcardNumber;
        }

        public IdcardDict getGender()
        {
            return gender;
        }

        public void setGender(IdcardDict gender)
        {
            this.gender = gender;
        }

        public IdcardDict getBirthYear()
        {
            return birthYear;
        }

        public void setBirthYear(IdcardDict birthYear)
        {
            this.birthYear = birthYear;
        }

        public IdcardDict getBirthMonth()
        {
            return birthMonth;
        }

        public void setBirthMonth(IdcardDict birthMonth)
        {
            this.birthMonth = birthMonth;
        }

        public IdcardDict getBirthDay()
        {
            return birthDay;
        }

        public void setBirthDay(IdcardDict birthDay)
        {
            this.birthDay = birthDay;
        }

        public IdcardDict getNationality()
        {
            return nationality;
        }

        public void setNationality(IdcardDict nationality)
        {
            this.nationality = nationality;
        }

        public IdcardDict getAddress()
        {
            return address;
        }

        public void setAddress(IdcardDict address)
        {
            this.address = address;
        }

        public IdcardDict getIssuedBy()
        {
            return issuedBy;
        }

        public void setIssuedBy(IdcardDict issuedBy)
        {
            this.issuedBy = issuedBy;
        }

        public IdcardDict getValidDateStart()
        {
            return validDateStart;
        }

        public void setValidDateStart(IdcardDict validDateStart)
        {
            this.validDateStart = validDateStart;
        }

        public IdcardDict getValidDateEnd()
        {
            return validDateEnd;
        }

        public void setValidDateEnd(IdcardDict validDateEnd)
        {
            this.validDateEnd = validDateEnd;
        }
    }

    public static class LivenessResult
    {
        private String result;
        @SerializedName(Const.API_PARAM_PROCEDURE_TYPE)
        private String procedureType;
        private Details details;
        @SerializedName(Const.API_PARAM_FACE_GENUINENESS)
        private FaceGenuineness faceGenuineness;

        public String getResult()
        {
            return result;
        }

        public void setResult(String result)
        {
            this.result = result;
        }

        public String getProcedureType()
        {
            return procedureType;
        }

        public void setProcedureType(String procedureType)
        {
            this.procedureType = procedureType;
        }

        public Details getDetails()
        {
            return details;
        }

        public void setDetails(Details details)
        {
            this.details = details;
        }

        public FaceGenuineness getFaceGenuineness()
        {
            return faceGenuineness;
        }

        public void setFaceGenuineness(FaceGenuineness faceGenuineness)
        {
            this.faceGenuineness = faceGenuineness;
        }
    }

    public static class Details
    {
        @SerializedName(Const.API_PARAM_UPLOAD_TIMES_UPPERCASE)
        private Integer uploadTimes;
        @SerializedName(Const.API_PARAM_FACE_NOT_FOUND_UPPERCASE)
        private Integer faceNotFound;
        @SerializedName(Const.API_PARAM_LOW_FACE_QUALITY_UPPERCASE)
        private Integer lowFaceQuality;
        @SerializedName(Const.API_PARAM_INVALID_VIDEO_DURATION_UPPERCASE)
        private Integer invalidVideoDuration;
        @SerializedName(Const.API_PARAM_SR_ERROR_UPPERCASE)
        private Integer srError;
        @SerializedName(Const.API_PARAM_NOT_SYNCHRONIZED_UPPERCASE)
        private Integer notSynchronized;
        @SerializedName(Const.API_PARAM_NO_AUDIO_UPPERCASE)
        private Integer noAudio;
        @SerializedName(Const.API_PARAM_VIDEO_FORMAT_UNSUPPORTED_UPPERCASE)
        private Integer videoFormatUnsupported;
        @SerializedName(Const.API_PARAM_VIDEO_FACE_INCONSISTENT_UPPERCASE)
        private Integer videoFaceInconsistent;
        @SerializedName(Const.API_PARAM_FACE_FRONT)
        private SelfieDetails faceFront;
        @SerializedName(Const.API_PARAM_FACE_SIDE)
        private SelfieDetails faceSide;

        public int getUploadTimes()
        {
            return uploadTimes;
        }

        public void setUploadTimes(int uploadTimes)
        {
            this.uploadTimes = uploadTimes;
        }

        public int getFaceNotFound()
        {
            return faceNotFound;
        }

        public void setFaceNotFound(int faceNotFound)
        {
            this.faceNotFound = faceNotFound;
        }

        public int getLowFaceQuality()
        {
            return lowFaceQuality;
        }

        public void setLowFaceQuality(int lowFaceQuality)
        {
            this.lowFaceQuality = lowFaceQuality;
        }

        public int getInvalidVideoDuration()
        {
            return invalidVideoDuration;
        }

        public void setInvalidVideoDuration(int invalidVideoDuration)
        {
            this.invalidVideoDuration = invalidVideoDuration;
        }

        public Integer getSrError()
        {
            return srError;
        }

        public void setSrError(Integer srError)
        {
            this.srError = srError;
        }

        public Integer getNotSynchronized()
        {
            return notSynchronized;
        }

        public void setNotSynchronized(Integer notSynchronized)
        {
            this.notSynchronized = notSynchronized;
        }

        public Integer getNoAudio()
        {
            return noAudio;
        }

        public void setNoAudio(Integer noAudio)
        {
            this.noAudio = noAudio;
        }

        public int getVideoFormatUnsupported()
        {
            return videoFormatUnsupported;
        }

        public void setVideoFormatUnsupported(int videoFormatUnsupported)
        {
            this.videoFormatUnsupported = videoFormatUnsupported;
        }

        public int getVideoFaceInconsistent()
        {
            return videoFaceInconsistent;
        }

        public void setVideoFaceInconsistent(int videoFaceInconsistent)
        {
            this.videoFaceInconsistent = videoFaceInconsistent;
        }

        public SelfieDetails getFaceFront()
        {
            return faceFront;
        }

        public void setFaceFront(SelfieDetails faceFront)
        {
            this.faceFront = faceFront;
        }

        public SelfieDetails getFaceSide()
        {
            return faceSide;
        }

        public void setFaceSide(SelfieDetails faceSide)
        {
            this.faceSide = faceSide;
        }
    }

    public static class SelfieDetails
    {
        @SerializedName(Const.API_PARAM_FACE_UPLOAD_TIMES_UPPERCASE)
        private int faceUploadTimes;
        @SerializedName(Const.API_PARAM_FACE_NOT_FOUND_UPPERCASE)
        private int faceNotFound;
        @SerializedName(Const.API_PARAM_FACE_BLURRED_UPPERCASE)
        private int faceBlurred;
        @SerializedName(Const.API_PARAM_FACE_MULTIPLE_FACES_UPPERCASE)
        private int faceMultipleFaces;
        @SerializedName(Const.API_PARAM_FACE_POOR_LIGHT_UPPERCASE)
        private int facePoorLight;
        @SerializedName(Const.API_PARAM_FACE_NOT_FRONT_UPPERCASE)
        private Integer faceNotFront;
        @SerializedName(Const.API_PARAM_FACE_NOT_SIDE_UPPERCASE)
        private Integer faceNotSide;
        @SerializedName(Const.API_PARAM_FACE_NOT_PROPER_POSITION_UPPERCASE)
        private int faceNotProperPosition;
        @SerializedName(Const.API_PARAM_UNSUPPORTED_FORMAT_UPPERCASE)
        private int unsupportedFormat;

        public int getFaceUploadTimes()
        {
            return faceUploadTimes;
        }

        public void setFaceUploadTimes(int faceUploadTimes)
        {
            this.faceUploadTimes = faceUploadTimes;
        }

        public int getFaceNotFound()
        {
            return faceNotFound;
        }

        public void setFaceNotFound(int faceNotFound)
        {
            this.faceNotFound = faceNotFound;
        }

        public int getFaceBlurred()
        {
            return faceBlurred;
        }

        public void setFaceBlurred(int faceBlurred)
        {
            this.faceBlurred = faceBlurred;
        }

        public int getFaceMultipleFaces()
        {
            return faceMultipleFaces;
        }

        public void setFaceMultipleFaces(int faceMultipleFaces)
        {
            this.faceMultipleFaces = faceMultipleFaces;
        }

        public int getFacePoorLight()
        {
            return facePoorLight;
        }

        public void setFacePoorLight(int facePoorLight)
        {
            this.facePoorLight = facePoorLight;
        }

        public Integer getFaceNotFront()
        {
            return faceNotFront;
        }

        public void setFaceNotFront(Integer faceNotFront)
        {
            this.faceNotFront = faceNotFront;
        }

        public Integer getFaceNotSide()
        {
            return faceNotSide;
        }

        public void setFaceNotSide(Integer faceNotSide)
        {
            this.faceNotSide = faceNotSide;
        }

        public int getFaceNotProperPosition()
        {
            return faceNotProperPosition;
        }

        public void setFaceNotProperPosition(int faceNotProperPosition)
        {
            this.faceNotProperPosition = faceNotProperPosition;
        }

        public int getUnsupportedFormat()
        {
            return unsupportedFormat;
        }

        public void setUnsupportedFormat(int unsupportedFormat)
        {
            this.unsupportedFormat = unsupportedFormat;
        }
    }

    public static class VerifyResult extends CompareResponse
    {
        @SerializedName(Const.API_PARAM_RESULT_IDCARD_PHOTO)
        private Result resultIdcardPhoto;
        @SerializedName(Const.API_PARAM_RESULT_IDCARD_DATASOURCE)
        private Result resultIdcardDatasource;

        public Result getResultIdcardPhoto()
        {
            return resultIdcardPhoto;
        }

        public void setResultIdcardPhoto(Result resultIdcardPhoto)
        {
            this.resultIdcardPhoto = resultIdcardPhoto;
        }

        public Result getResultIdcardDatasource()
        {
            return resultIdcardDatasource;
        }

        public void setResultIdcardDatasource(Result resultIdcardDatasource)
        {
            this.resultIdcardDatasource = resultIdcardDatasource;
        }
    }
}
