# V1beta1Occurrence

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | Output only. The name of the occurrence in the form of &#x60;projects/[PROJECT_ID]/occurrences/[OCCURRENCE_ID]&#x60;. |  [optional]
**resource** | [**V1beta1Resource**](V1beta1Resource.md) |  |  [optional]
**noteName** | **String** | Required. Immutable. The analysis note associated with this occurrence, in the form of &#x60;projects/[PROVIDER_ID]/notes/[NOTE_ID]&#x60;. This field can be used as a filter in list requests. |  [optional]
**kind** | [**V1beta1NoteKind**](V1beta1NoteKind.md) |  |  [optional]
**remediation** | **String** | A description of actions that can be taken to remedy the note. |  [optional]
**createTime** | [**OffsetDateTime**](OffsetDateTime.md) | Output only. The time this occurrence was created. |  [optional]
**updateTime** | [**OffsetDateTime**](OffsetDateTime.md) | Output only. The time this occurrence was last updated. |  [optional]
**vulnerability** | [**V1beta1vulnerabilityDetails**](V1beta1vulnerabilityDetails.md) |  |  [optional]
**build** | [**V1beta1buildDetails**](V1beta1buildDetails.md) |  |  [optional]
**derivedImage** | [**V1beta1imageDetails**](V1beta1imageDetails.md) |  |  [optional]
**installation** | [**V1beta1packageDetails**](V1beta1packageDetails.md) |  |  [optional]
**deployment** | [**V1beta1deploymentDetails**](V1beta1deploymentDetails.md) |  |  [optional]
**discovered** | [**V1beta1discoveryDetails**](V1beta1discoveryDetails.md) |  |  [optional]
**attestation** | [**V1beta1attestationDetails**](V1beta1attestationDetails.md) |  |  [optional]
