SELECT
  *
FROM
  MPERSON, MLIKES_PERSON_PLACE
  WHERE
    MPERSON.ID = MLIKES_PERSON_PLACE.FK_PERSON AND MLIKES_PERSON_PLACE.FK_PLACE = #{placeId}
