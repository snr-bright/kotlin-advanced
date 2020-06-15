package com.bright.pluralsightkotlin

class PersonalReview(
    meetingName: String,
    participant: Participant,
    reviewers: List<Participant>,
    location: Location = Location()
) : Meeting(meetingName, location) {

    //MARK: only apply to this class not the inherited
    fun closeReview() {
        print("Review Ended")
    }

    override fun verifyMeeting() {
        print("Personal Review Ended")
        super.verifyMeeting()
    }
}