SELECT
  *
FROM
  PLACE, LIKES_PERSON_PLACE
  WHERE
    PLACE.ID = LIKES_PERSON_PLACE.FK_PLACE AND LIKES_PERSON_PLACE.FK_PERSON = #{personId}
