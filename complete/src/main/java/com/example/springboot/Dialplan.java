package com.example.springboot;

public class Dialplan {
	private String hostname;

	private String section;

	private String tag_name;

	private String key_name;

	private String key_value;

	private String Event_Name;

	private String Core_UUID;

	private String FreeSWITCH_Hostname;

	private String FreeSWITCH_Switchname;

	private String FreeSWITCH_IPv4;

	private String FreeSWITCH_IPv6;

	private String Event_Date_Local;

	private String Event_Date_GMT;

	private String Event_Date_Timestamp;

	private String Event_Calling_File;

	private String Event_Calling_Function;

	private String Event_Calling_Line_Number;

	private String Event_Sequence;

	private String Channel_State;

	private String Channel_Call_State;

	private String Channel_State_Number;

	private String Channel_Name;

	private String Unique_ID;

	private String Call_Direction;

	private String Presence_Call_Direction;

	private String Channel_HIT_Dialplan;

	private String Channel_Presence_ID;

	private String Channel_Call_UUID;

	private String Answer_State;

	private String Caller_Direction;

	private String Caller_Logical_Direction;

	private String Caller_Username;

	private String Caller_Dialplan;

	private String Caller_Caller_ID_Name;

	private String Caller_Caller_ID_Number;

	private String Caller_Orig_Caller_ID_Name;

	private String Caller_Orig_Caller_ID_Number;

	private String Caller_Network_Addr;

	private String Caller_ANI;

	private String Caller_Destination_Number;

	private String Caller_Unique_ID;

	private String Caller_Source;

	private String Caller_Context;

	private String Caller_Channel_Name;

	private String Caller_Profile_Index;

	private String Caller_Profile_Created_Time;

	private String Caller_Channel_Created_Time;

	private String Caller_Channel_Answered_Time;

	private String Caller_Channel_Progress_Time;

	private String Caller_Channel_Progress_Media_Time;

	private String Caller_Channel_Hangup_Time;

	private String Caller_Channel_Transfer_Time;

	private String Caller_Channel_Resurrect_Time;

	private String Caller_Channel_Bridged_Time;

	private String Caller_Channel_Last_Hold;

	private String Caller_Channel_Hold_Accum;

	private String Caller_Screen_Bit;

	private String Caller_Privacy_Hide_Name;

	private String Caller_Privacy_Hide_Number;

	private String variable_direction;

	private String variable_uuid;

	private String variable_session_id;

	private String variable_sip_from_user;

	private String variable_sip_from_uri;

	private String variable_sip_from_host;

	private String variable_video_media_flow;

	private String variable_audio_media_flow;

	private String variable_text_media_flow;

	private String variable_channel_name;

	private String variable_sip_call_id;

	private String variable_sip_local_network_addr;

	private String variable_sip_network_ip;

	private String variable_sip_network_port;

	private String variable_sip_invite_stamp;

	private String variable_sip_received_ip;

	private String variable_sip_received_port;

	private String variable_sip_via_protocol;

	private String variable_sip_authorized;

	private String variable_Event_Name;

	private String variable_Core_UUID;

	private String variable_FreeSWITCH_Hostname;

	private String variable_FreeSWITCH_Switchname;

	private String variable_FreeSWITCH_IPv4;

	private String variable_FreeSWITCH_IPv6;

	private String variable_Event_Date_Local;

	private String variable_Event_Date_GMT;

	private String variable_Event_Date_Timestamp;

	private String variable_Event_Calling_File;

	private String variable_Event_Calling_Function;

	private String variable_Event_Calling_Line_Number;

	private String variable_Event_Sequence;

	private String variable_sip_number_alias;

	private String variable_sip_auth_username;

	private String variable_sip_auth_realm;

	private String variable_number_alias;

	private String variable_requested_user_name;

	private String variable_requested_domain_name;

	private String variable_record_stereo;

	private String variable_default_gateway;

	private String variable_default_areacode;

	private String variable_transfer_fallback_extension;

	private String variable_toll_allow;

	private String variable_accountcode;

	private String variable_user_context;

	private String variable_effective_caller_id_name;

	private String variable_effective_caller_id_number;

	private String variable_outbound_caller_id_name;

	private String variable_outbound_caller_id_number;

	private String variable_callgroup;

	private String variable_user_name;

	private String variable_domain_name;

	private String variable_sip_from_user_stripped;

	private String variable_sip_from_tag;

	private String variable_sofia_profile_name;

	private String variable_sofia_profile_url;

	private String variable_recovery_profile_name;

	private String variable_sip_full_via;

	private String variable_sip_full_from;

	private String variable_sip_full_to;

	private String variable_sip_allow;

	private String variable_sip_req_user;

	private String variable_sip_req_uri;

	private String variable_sip_req_host;

	private String variable_sip_to_user;

	private String variable_sip_to_uri;

	private String variable_sip_to_host;

	private String variable_sip_contact_params;

	private String variable_sip_contact_user;

	private String variable_sip_contact_port;

	private String variable_sip_contact_uri;

	private String variable_sip_contact_host;

	private String variable_rtp_use_codec_string;

	private String variable_sip_user_agent;

	private String variable_sip_via_host;

	private String variable_sip_via_port;

	private String variable_sip_via_rport;

	private String variable_max_forwards;

	private String variable_presence_id;

	private String variable_switch_r_sdp;

	private String variable_ep_codec_string;

	private String variable_endpoint_disposition;

	private String variable_call_uuid;

	private String Hunt_Direction;

	private String Hunt_Logical_Direction;

	private String Hunt_Username;

	private String Hunt_Dialplan;

	private String Hunt_Caller_ID_Name;

	private String Hunt_Caller_ID_Number;

	private String Hunt_Orig_Caller_ID_Name;

	private String Hunt_Orig_Caller_ID_Number;

	private String Hunt_Network_Addr;

	private String Hunt_ANI;

	private String Hunt_Destination_Number;

	private String Hunt_Unique_ID;

	private String Hunt_Source;

	private String Hunt_Context;

	private String Hunt_Channel_Name;

	private String Hunt_Profile_Index;

	private String Hunt_Profile_Created_Time;

	private String Hunt_Channel_Created_Time;

	private String Hunt_Channel_Answered_Time;

	private String Hunt_Channel_Progress_Time;

	private String Hunt_Channel_Progress_Media_Time;

	private String Hunt_Channel_Hangup_Time;

	private String Hunt_Channel_Transfer_Time;

	private String Hunt_Channel_Resurrect_Time;

	private String Hunt_Channel_Bridged_Time;

	private String Hunt_Channel_Last_Hold;

	private String Hunt_Channel_Hold_Accum;

	private String Hunt_Screen_Bit;

	private String Hunt_Privacy_Hide_Name;

	private String Hunt_Privacy_Hide_Number;

	public String getHostname() {
		return hostname;
	}

	public void setHostname(String hostname) {
		this.hostname = hostname;
	}

	public String getSection() {
		return section;
	}

	public void setSection(String section) {
		this.section = section;
	}

	public String getTag_name() {
		return tag_name;
	}

	public void setTag_name(String tag_name) {
		this.tag_name = tag_name;
	}

	public String getKey_name() {
		return key_name;
	}

	public void setKey_name(String key_name) {
		this.key_name = key_name;
	}

	public String getKey_value() {
		return key_value;
	}

	public void setKey_value(String key_value) {
		this.key_value = key_value;
	}

	public String getEvent_Name() {
		return Event_Name;
	}

	public void setEvent_Name(String event_Name) {
		Event_Name = event_Name;
	}

	public String getCore_UUID() {
		return Core_UUID;
	}

	public void setCore_UUID(String core_UUID) {
		Core_UUID = core_UUID;
	}

	public String getFreeSWITCH_Hostname() {
		return FreeSWITCH_Hostname;
	}

	public void setFreeSWITCH_Hostname(String freeSWITCH_Hostname) {
		FreeSWITCH_Hostname = freeSWITCH_Hostname;
	}

	public String getFreeSWITCH_Switchname() {
		return FreeSWITCH_Switchname;
	}

	public void setFreeSWITCH_Switchname(String freeSWITCH_Switchname) {
		FreeSWITCH_Switchname = freeSWITCH_Switchname;
	}

	public String getFreeSWITCH_IPv4() {
		return FreeSWITCH_IPv4;
	}

	public void setFreeSWITCH_IPv4(String freeSWITCH_IPv4) {
		FreeSWITCH_IPv4 = freeSWITCH_IPv4;
	}

	public String getFreeSWITCH_IPv6() {
		return FreeSWITCH_IPv6;
	}

	public void setFreeSWITCH_IPv6(String freeSWITCH_IPv6) {
		FreeSWITCH_IPv6 = freeSWITCH_IPv6;
	}

	public String getEvent_Date_Local() {
		return Event_Date_Local;
	}

	public void setEvent_Date_Local(String event_Date_Local) {
		Event_Date_Local = event_Date_Local;
	}

	public String getEvent_Date_GMT() {
		return Event_Date_GMT;
	}

	public void setEvent_Date_GMT(String event_Date_GMT) {
		Event_Date_GMT = event_Date_GMT;
	}

	public String getEvent_Date_Timestamp() {
		return Event_Date_Timestamp;
	}

	public void setEvent_Date_Timestamp(String event_Date_Timestamp) {
		Event_Date_Timestamp = event_Date_Timestamp;
	}

	public String getEvent_Calling_File() {
		return Event_Calling_File;
	}

	public void setEvent_Calling_File(String event_Calling_File) {
		Event_Calling_File = event_Calling_File;
	}

	public String getEvent_Calling_Function() {
		return Event_Calling_Function;
	}

	public void setEvent_Calling_Function(String event_Calling_Function) {
		Event_Calling_Function = event_Calling_Function;
	}

	public String getEvent_Calling_Line_Number() {
		return Event_Calling_Line_Number;
	}

	public void setEvent_Calling_Line_Number(String event_Calling_Line_Number) {
		Event_Calling_Line_Number = event_Calling_Line_Number;
	}

	public String getEvent_Sequence() {
		return Event_Sequence;
	}

	public void setEvent_Sequence(String event_Sequence) {
		Event_Sequence = event_Sequence;
	}

	public String getChannel_State() {
		return Channel_State;
	}

	public void setChannel_State(String channel_State) {
		Channel_State = channel_State;
	}

	public String getChannel_Call_State() {
		return Channel_Call_State;
	}

	public void setChannel_Call_State(String channel_Call_State) {
		Channel_Call_State = channel_Call_State;
	}

	public String getChannel_State_Number() {
		return Channel_State_Number;
	}

	public void setChannel_State_Number(String channel_State_Number) {
		Channel_State_Number = channel_State_Number;
	}

	public String getChannel_Name() {
		return Channel_Name;
	}

	public void setChannel_Name(String channel_Name) {
		Channel_Name = channel_Name;
	}

	public String getUnique_ID() {
		return Unique_ID;
	}

	public void setUnique_ID(String unique_ID) {
		Unique_ID = unique_ID;
	}

	public String getCall_Direction() {
		return Call_Direction;
	}

	public void setCall_Direction(String call_Direction) {
		Call_Direction = call_Direction;
	}

	public String getPresence_Call_Direction() {
		return Presence_Call_Direction;
	}

	public void setPresence_Call_Direction(String presence_Call_Direction) {
		Presence_Call_Direction = presence_Call_Direction;
	}

	public String getChannel_HIT_Dialplan() {
		return Channel_HIT_Dialplan;
	}

	public void setChannel_HIT_Dialplan(String channel_HIT_Dialplan) {
		Channel_HIT_Dialplan = channel_HIT_Dialplan;
	}

	public String getChannel_Presence_ID() {
		return Channel_Presence_ID;
	}

	public void setChannel_Presence_ID(String channel_Presence_ID) {
		Channel_Presence_ID = channel_Presence_ID;
	}

	public String getChannel_Call_UUID() {
		return Channel_Call_UUID;
	}

	public void setChannel_Call_UUID(String channel_Call_UUID) {
		Channel_Call_UUID = channel_Call_UUID;
	}

	public String getAnswer_State() {
		return Answer_State;
	}

	public void setAnswer_State(String answer_State) {
		Answer_State = answer_State;
	}

	public String getCaller_Direction() {
		return Caller_Direction;
	}

	public void setCaller_Direction(String caller_Direction) {
		Caller_Direction = caller_Direction;
	}

	public String getCaller_Logical_Direction() {
		return Caller_Logical_Direction;
	}

	public void setCaller_Logical_Direction(String caller_Logical_Direction) {
		Caller_Logical_Direction = caller_Logical_Direction;
	}

	public String getCaller_Username() {
		return Caller_Username;
	}

	public void setCaller_Username(String caller_Username) {
		Caller_Username = caller_Username;
	}

	public String getCaller_Dialplan() {
		return Caller_Dialplan;
	}

	public void setCaller_Dialplan(String caller_Dialplan) {
		Caller_Dialplan = caller_Dialplan;
	}

	public String getCaller_Caller_ID_Name() {
		return Caller_Caller_ID_Name;
	}

	public void setCaller_Caller_ID_Name(String caller_Caller_ID_Name) {
		Caller_Caller_ID_Name = caller_Caller_ID_Name;
	}

	public String getCaller_Caller_ID_Number() {
		return Caller_Caller_ID_Number;
	}

	public void setCaller_Caller_ID_Number(String caller_Caller_ID_Number) {
		Caller_Caller_ID_Number = caller_Caller_ID_Number;
	}

	public String getCaller_Orig_Caller_ID_Name() {
		return Caller_Orig_Caller_ID_Name;
	}

	public void setCaller_Orig_Caller_ID_Name(String caller_Orig_Caller_ID_Name) {
		Caller_Orig_Caller_ID_Name = caller_Orig_Caller_ID_Name;
	}

	public String getCaller_Orig_Caller_ID_Number() {
		return Caller_Orig_Caller_ID_Number;
	}

	public void setCaller_Orig_Caller_ID_Number(String caller_Orig_Caller_ID_Number) {
		Caller_Orig_Caller_ID_Number = caller_Orig_Caller_ID_Number;
	}

	public String getCaller_Network_Addr() {
		return Caller_Network_Addr;
	}

	public void setCaller_Network_Addr(String caller_Network_Addr) {
		Caller_Network_Addr = caller_Network_Addr;
	}

	public String getCaller_ANI() {
		return Caller_ANI;
	}

	public void setCaller_ANI(String caller_ANI) {
		Caller_ANI = caller_ANI;
	}

	public String getCaller_Destination_Number() {
		return Caller_Destination_Number;
	}

	public void setCaller_Destination_Number(String caller_Destination_Number) {
		Caller_Destination_Number = caller_Destination_Number;
	}

	public String getCaller_Unique_ID() {
		return Caller_Unique_ID;
	}

	public void setCaller_Unique_ID(String caller_Unique_ID) {
		Caller_Unique_ID = caller_Unique_ID;
	}

	public String getCaller_Source() {
		return Caller_Source;
	}

	public void setCaller_Source(String caller_Source) {
		Caller_Source = caller_Source;
	}

	public String getCaller_Context() {
		return Caller_Context;
	}

	public void setCaller_Context(String caller_Context) {
		Caller_Context = caller_Context;
	}

	public String getCaller_Channel_Name() {
		return Caller_Channel_Name;
	}

	public void setCaller_Channel_Name(String caller_Channel_Name) {
		Caller_Channel_Name = caller_Channel_Name;
	}

	public String getCaller_Profile_Index() {
		return Caller_Profile_Index;
	}

	public void setCaller_Profile_Index(String caller_Profile_Index) {
		Caller_Profile_Index = caller_Profile_Index;
	}

	public String getCaller_Profile_Created_Time() {
		return Caller_Profile_Created_Time;
	}

	public void setCaller_Profile_Created_Time(String caller_Profile_Created_Time) {
		Caller_Profile_Created_Time = caller_Profile_Created_Time;
	}

	public String getCaller_Channel_Created_Time() {
		return Caller_Channel_Created_Time;
	}

	public void setCaller_Channel_Created_Time(String caller_Channel_Created_Time) {
		Caller_Channel_Created_Time = caller_Channel_Created_Time;
	}

	public String getCaller_Channel_Answered_Time() {
		return Caller_Channel_Answered_Time;
	}

	public void setCaller_Channel_Answered_Time(String caller_Channel_Answered_Time) {
		Caller_Channel_Answered_Time = caller_Channel_Answered_Time;
	}

	public String getCaller_Channel_Progress_Time() {
		return Caller_Channel_Progress_Time;
	}

	public void setCaller_Channel_Progress_Time(String caller_Channel_Progress_Time) {
		Caller_Channel_Progress_Time = caller_Channel_Progress_Time;
	}

	public String getCaller_Channel_Progress_Media_Time() {
		return Caller_Channel_Progress_Media_Time;
	}

	public void setCaller_Channel_Progress_Media_Time(String caller_Channel_Progress_Media_Time) {
		Caller_Channel_Progress_Media_Time = caller_Channel_Progress_Media_Time;
	}

	public String getCaller_Channel_Hangup_Time() {
		return Caller_Channel_Hangup_Time;
	}

	public void setCaller_Channel_Hangup_Time(String caller_Channel_Hangup_Time) {
		Caller_Channel_Hangup_Time = caller_Channel_Hangup_Time;
	}

	public String getCaller_Channel_Transfer_Time() {
		return Caller_Channel_Transfer_Time;
	}

	public void setCaller_Channel_Transfer_Time(String caller_Channel_Transfer_Time) {
		Caller_Channel_Transfer_Time = caller_Channel_Transfer_Time;
	}

	public String getCaller_Channel_Resurrect_Time() {
		return Caller_Channel_Resurrect_Time;
	}

	public void setCaller_Channel_Resurrect_Time(String caller_Channel_Resurrect_Time) {
		Caller_Channel_Resurrect_Time = caller_Channel_Resurrect_Time;
	}

	public String getCaller_Channel_Bridged_Time() {
		return Caller_Channel_Bridged_Time;
	}

	public void setCaller_Channel_Bridged_Time(String caller_Channel_Bridged_Time) {
		Caller_Channel_Bridged_Time = caller_Channel_Bridged_Time;
	}

	public String getCaller_Channel_Last_Hold() {
		return Caller_Channel_Last_Hold;
	}

	public void setCaller_Channel_Last_Hold(String caller_Channel_Last_Hold) {
		Caller_Channel_Last_Hold = caller_Channel_Last_Hold;
	}

	public String getCaller_Channel_Hold_Accum() {
		return Caller_Channel_Hold_Accum;
	}

	public void setCaller_Channel_Hold_Accum(String caller_Channel_Hold_Accum) {
		Caller_Channel_Hold_Accum = caller_Channel_Hold_Accum;
	}

	public String getCaller_Screen_Bit() {
		return Caller_Screen_Bit;
	}

	public void setCaller_Screen_Bit(String caller_Screen_Bit) {
		Caller_Screen_Bit = caller_Screen_Bit;
	}

	public String getCaller_Privacy_Hide_Name() {
		return Caller_Privacy_Hide_Name;
	}

	public void setCaller_Privacy_Hide_Name(String caller_Privacy_Hide_Name) {
		Caller_Privacy_Hide_Name = caller_Privacy_Hide_Name;
	}

	public String getCaller_Privacy_Hide_Number() {
		return Caller_Privacy_Hide_Number;
	}

	public void setCaller_Privacy_Hide_Number(String caller_Privacy_Hide_Number) {
		Caller_Privacy_Hide_Number = caller_Privacy_Hide_Number;
	}

	public String getVariable_direction() {
		return variable_direction;
	}

	public void setVariable_direction(String variable_direction) {
		this.variable_direction = variable_direction;
	}

	public String getVariable_uuid() {
		return variable_uuid;
	}

	public void setVariable_uuid(String variable_uuid) {
		this.variable_uuid = variable_uuid;
	}

	public String getVariable_session_id() {
		return variable_session_id;
	}

	public void setVariable_session_id(String variable_session_id) {
		this.variable_session_id = variable_session_id;
	}

	public String getVariable_sip_from_user() {
		return variable_sip_from_user;
	}

	public void setVariable_sip_from_user(String variable_sip_from_user) {
		this.variable_sip_from_user = variable_sip_from_user;
	}

	public String getVariable_sip_from_uri() {
		return variable_sip_from_uri;
	}

	public void setVariable_sip_from_uri(String variable_sip_from_uri) {
		this.variable_sip_from_uri = variable_sip_from_uri;
	}

	public String getVariable_sip_from_host() {
		return variable_sip_from_host;
	}

	public void setVariable_sip_from_host(String variable_sip_from_host) {
		this.variable_sip_from_host = variable_sip_from_host;
	}

	public String getVariable_video_media_flow() {
		return variable_video_media_flow;
	}

	public void setVariable_video_media_flow(String variable_video_media_flow) {
		this.variable_video_media_flow = variable_video_media_flow;
	}

	public String getVariable_audio_media_flow() {
		return variable_audio_media_flow;
	}

	public void setVariable_audio_media_flow(String variable_audio_media_flow) {
		this.variable_audio_media_flow = variable_audio_media_flow;
	}

	public String getVariable_text_media_flow() {
		return variable_text_media_flow;
	}

	public void setVariable_text_media_flow(String variable_text_media_flow) {
		this.variable_text_media_flow = variable_text_media_flow;
	}

	public String getVariable_channel_name() {
		return variable_channel_name;
	}

	public void setVariable_channel_name(String variable_channel_name) {
		this.variable_channel_name = variable_channel_name;
	}

	public String getVariable_sip_call_id() {
		return variable_sip_call_id;
	}

	public void setVariable_sip_call_id(String variable_sip_call_id) {
		this.variable_sip_call_id = variable_sip_call_id;
	}

	public String getVariable_sip_local_network_addr() {
		return variable_sip_local_network_addr;
	}

	public void setVariable_sip_local_network_addr(String variable_sip_local_network_addr) {
		this.variable_sip_local_network_addr = variable_sip_local_network_addr;
	}

	public String getVariable_sip_network_ip() {
		return variable_sip_network_ip;
	}

	public void setVariable_sip_network_ip(String variable_sip_network_ip) {
		this.variable_sip_network_ip = variable_sip_network_ip;
	}

	public String getVariable_sip_network_port() {
		return variable_sip_network_port;
	}

	public void setVariable_sip_network_port(String variable_sip_network_port) {
		this.variable_sip_network_port = variable_sip_network_port;
	}

	public String getVariable_sip_invite_stamp() {
		return variable_sip_invite_stamp;
	}

	public void setVariable_sip_invite_stamp(String variable_sip_invite_stamp) {
		this.variable_sip_invite_stamp = variable_sip_invite_stamp;
	}

	public String getVariable_sip_received_ip() {
		return variable_sip_received_ip;
	}

	public void setVariable_sip_received_ip(String variable_sip_received_ip) {
		this.variable_sip_received_ip = variable_sip_received_ip;
	}

	public String getVariable_sip_received_port() {
		return variable_sip_received_port;
	}

	public void setVariable_sip_received_port(String variable_sip_received_port) {
		this.variable_sip_received_port = variable_sip_received_port;
	}

	public String getVariable_sip_via_protocol() {
		return variable_sip_via_protocol;
	}

	public void setVariable_sip_via_protocol(String variable_sip_via_protocol) {
		this.variable_sip_via_protocol = variable_sip_via_protocol;
	}

	public String getVariable_sip_authorized() {
		return variable_sip_authorized;
	}

	public void setVariable_sip_authorized(String variable_sip_authorized) {
		this.variable_sip_authorized = variable_sip_authorized;
	}

	public String getVariable_Event_Name() {
		return variable_Event_Name;
	}

	public void setVariable_Event_Name(String variable_Event_Name) {
		this.variable_Event_Name = variable_Event_Name;
	}

	public String getVariable_Core_UUID() {
		return variable_Core_UUID;
	}

	public void setVariable_Core_UUID(String variable_Core_UUID) {
		this.variable_Core_UUID = variable_Core_UUID;
	}

	public String getVariable_FreeSWITCH_Hostname() {
		return variable_FreeSWITCH_Hostname;
	}

	public void setVariable_FreeSWITCH_Hostname(String variable_FreeSWITCH_Hostname) {
		this.variable_FreeSWITCH_Hostname = variable_FreeSWITCH_Hostname;
	}

	public String getVariable_FreeSWITCH_Switchname() {
		return variable_FreeSWITCH_Switchname;
	}

	public void setVariable_FreeSWITCH_Switchname(String variable_FreeSWITCH_Switchname) {
		this.variable_FreeSWITCH_Switchname = variable_FreeSWITCH_Switchname;
	}

	public String getVariable_FreeSWITCH_IPv4() {
		return variable_FreeSWITCH_IPv4;
	}

	public void setVariable_FreeSWITCH_IPv4(String variable_FreeSWITCH_IPv4) {
		this.variable_FreeSWITCH_IPv4 = variable_FreeSWITCH_IPv4;
	}

	public String getVariable_FreeSWITCH_IPv6() {
		return variable_FreeSWITCH_IPv6;
	}

	public void setVariable_FreeSWITCH_IPv6(String variable_FreeSWITCH_IPv6) {
		this.variable_FreeSWITCH_IPv6 = variable_FreeSWITCH_IPv6;
	}

	public String getVariable_Event_Date_Local() {
		return variable_Event_Date_Local;
	}

	public void setVariable_Event_Date_Local(String variable_Event_Date_Local) {
		this.variable_Event_Date_Local = variable_Event_Date_Local;
	}

	public String getVariable_Event_Date_GMT() {
		return variable_Event_Date_GMT;
	}

	public void setVariable_Event_Date_GMT(String variable_Event_Date_GMT) {
		this.variable_Event_Date_GMT = variable_Event_Date_GMT;
	}

	public String getVariable_Event_Date_Timestamp() {
		return variable_Event_Date_Timestamp;
	}

	public void setVariable_Event_Date_Timestamp(String variable_Event_Date_Timestamp) {
		this.variable_Event_Date_Timestamp = variable_Event_Date_Timestamp;
	}

	public String getVariable_Event_Calling_File() {
		return variable_Event_Calling_File;
	}

	public void setVariable_Event_Calling_File(String variable_Event_Calling_File) {
		this.variable_Event_Calling_File = variable_Event_Calling_File;
	}

	public String getVariable_Event_Calling_Function() {
		return variable_Event_Calling_Function;
	}

	public void setVariable_Event_Calling_Function(String variable_Event_Calling_Function) {
		this.variable_Event_Calling_Function = variable_Event_Calling_Function;
	}

	public String getVariable_Event_Calling_Line_Number() {
		return variable_Event_Calling_Line_Number;
	}

	public void setVariable_Event_Calling_Line_Number(String variable_Event_Calling_Line_Number) {
		this.variable_Event_Calling_Line_Number = variable_Event_Calling_Line_Number;
	}

	public String getVariable_Event_Sequence() {
		return variable_Event_Sequence;
	}

	public void setVariable_Event_Sequence(String variable_Event_Sequence) {
		this.variable_Event_Sequence = variable_Event_Sequence;
	}

	public String getVariable_sip_number_alias() {
		return variable_sip_number_alias;
	}

	public void setVariable_sip_number_alias(String variable_sip_number_alias) {
		this.variable_sip_number_alias = variable_sip_number_alias;
	}

	public String getVariable_sip_auth_username() {
		return variable_sip_auth_username;
	}

	public void setVariable_sip_auth_username(String variable_sip_auth_username) {
		this.variable_sip_auth_username = variable_sip_auth_username;
	}

	public String getVariable_sip_auth_realm() {
		return variable_sip_auth_realm;
	}

	public void setVariable_sip_auth_realm(String variable_sip_auth_realm) {
		this.variable_sip_auth_realm = variable_sip_auth_realm;
	}

	public String getVariable_number_alias() {
		return variable_number_alias;
	}

	public void setVariable_number_alias(String variable_number_alias) {
		this.variable_number_alias = variable_number_alias;
	}

	public String getVariable_requested_user_name() {
		return variable_requested_user_name;
	}

	public void setVariable_requested_user_name(String variable_requested_user_name) {
		this.variable_requested_user_name = variable_requested_user_name;
	}

	public String getVariable_requested_domain_name() {
		return variable_requested_domain_name;
	}

	public void setVariable_requested_domain_name(String variable_requested_domain_name) {
		this.variable_requested_domain_name = variable_requested_domain_name;
	}

	public String getVariable_record_stereo() {
		return variable_record_stereo;
	}

	public void setVariable_record_stereo(String variable_record_stereo) {
		this.variable_record_stereo = variable_record_stereo;
	}

	public String getVariable_default_gateway() {
		return variable_default_gateway;
	}

	public void setVariable_default_gateway(String variable_default_gateway) {
		this.variable_default_gateway = variable_default_gateway;
	}

	public String getVariable_default_areacode() {
		return variable_default_areacode;
	}

	public void setVariable_default_areacode(String variable_default_areacode) {
		this.variable_default_areacode = variable_default_areacode;
	}

	public String getVariable_transfer_fallback_extension() {
		return variable_transfer_fallback_extension;
	}

	public void setVariable_transfer_fallback_extension(String variable_transfer_fallback_extension) {
		this.variable_transfer_fallback_extension = variable_transfer_fallback_extension;
	}

	public String getVariable_toll_allow() {
		return variable_toll_allow;
	}

	public void setVariable_toll_allow(String variable_toll_allow) {
		this.variable_toll_allow = variable_toll_allow;
	}

	public String getVariable_accountcode() {
		return variable_accountcode;
	}

	public void setVariable_accountcode(String variable_accountcode) {
		this.variable_accountcode = variable_accountcode;
	}

	public String getVariable_user_context() {
		return variable_user_context;
	}

	public void setVariable_user_context(String variable_user_context) {
		this.variable_user_context = variable_user_context;
	}

	public String getVariable_effective_caller_id_name() {
		return variable_effective_caller_id_name;
	}

	public void setVariable_effective_caller_id_name(String variable_effective_caller_id_name) {
		this.variable_effective_caller_id_name = variable_effective_caller_id_name;
	}

	public String getVariable_effective_caller_id_number() {
		return variable_effective_caller_id_number;
	}

	public void setVariable_effective_caller_id_number(String variable_effective_caller_id_number) {
		this.variable_effective_caller_id_number = variable_effective_caller_id_number;
	}

	public String getVariable_outbound_caller_id_name() {
		return variable_outbound_caller_id_name;
	}

	public void setVariable_outbound_caller_id_name(String variable_outbound_caller_id_name) {
		this.variable_outbound_caller_id_name = variable_outbound_caller_id_name;
	}

	public String getVariable_outbound_caller_id_number() {
		return variable_outbound_caller_id_number;
	}

	public void setVariable_outbound_caller_id_number(String variable_outbound_caller_id_number) {
		this.variable_outbound_caller_id_number = variable_outbound_caller_id_number;
	}

	public String getVariable_callgroup() {
		return variable_callgroup;
	}

	public void setVariable_callgroup(String variable_callgroup) {
		this.variable_callgroup = variable_callgroup;
	}

	public String getVariable_user_name() {
		return variable_user_name;
	}

	public void setVariable_user_name(String variable_user_name) {
		this.variable_user_name = variable_user_name;
	}

	public String getVariable_domain_name() {
		return variable_domain_name;
	}

	public void setVariable_domain_name(String variable_domain_name) {
		this.variable_domain_name = variable_domain_name;
	}

	public String getVariable_sip_from_user_stripped() {
		return variable_sip_from_user_stripped;
	}

	public void setVariable_sip_from_user_stripped(String variable_sip_from_user_stripped) {
		this.variable_sip_from_user_stripped = variable_sip_from_user_stripped;
	}

	public String getVariable_sip_from_tag() {
		return variable_sip_from_tag;
	}

	public void setVariable_sip_from_tag(String variable_sip_from_tag) {
		this.variable_sip_from_tag = variable_sip_from_tag;
	}

	public String getVariable_sofia_profile_name() {
		return variable_sofia_profile_name;
	}

	public void setVariable_sofia_profile_name(String variable_sofia_profile_name) {
		this.variable_sofia_profile_name = variable_sofia_profile_name;
	}

	public String getVariable_sofia_profile_url() {
		return variable_sofia_profile_url;
	}

	public void setVariable_sofia_profile_url(String variable_sofia_profile_url) {
		this.variable_sofia_profile_url = variable_sofia_profile_url;
	}

	public String getVariable_recovery_profile_name() {
		return variable_recovery_profile_name;
	}

	public void setVariable_recovery_profile_name(String variable_recovery_profile_name) {
		this.variable_recovery_profile_name = variable_recovery_profile_name;
	}

	public String getVariable_sip_full_via() {
		return variable_sip_full_via;
	}

	public void setVariable_sip_full_via(String variable_sip_full_via) {
		this.variable_sip_full_via = variable_sip_full_via;
	}

	public String getVariable_sip_full_from() {
		return variable_sip_full_from;
	}

	public void setVariable_sip_full_from(String variable_sip_full_from) {
		this.variable_sip_full_from = variable_sip_full_from;
	}

	public String getVariable_sip_full_to() {
		return variable_sip_full_to;
	}

	public void setVariable_sip_full_to(String variable_sip_full_to) {
		this.variable_sip_full_to = variable_sip_full_to;
	}

	public String getVariable_sip_allow() {
		return variable_sip_allow;
	}

	public void setVariable_sip_allow(String variable_sip_allow) {
		this.variable_sip_allow = variable_sip_allow;
	}

	public String getVariable_sip_req_user() {
		return variable_sip_req_user;
	}

	public void setVariable_sip_req_user(String variable_sip_req_user) {
		this.variable_sip_req_user = variable_sip_req_user;
	}

	public String getVariable_sip_req_uri() {
		return variable_sip_req_uri;
	}

	public void setVariable_sip_req_uri(String variable_sip_req_uri) {
		this.variable_sip_req_uri = variable_sip_req_uri;
	}

	public String getVariable_sip_req_host() {
		return variable_sip_req_host;
	}

	public void setVariable_sip_req_host(String variable_sip_req_host) {
		this.variable_sip_req_host = variable_sip_req_host;
	}

	public String getVariable_sip_to_user() {
		return variable_sip_to_user;
	}

	public void setVariable_sip_to_user(String variable_sip_to_user) {
		this.variable_sip_to_user = variable_sip_to_user;
	}

	public String getVariable_sip_to_uri() {
		return variable_sip_to_uri;
	}

	public void setVariable_sip_to_uri(String variable_sip_to_uri) {
		this.variable_sip_to_uri = variable_sip_to_uri;
	}

	public String getVariable_sip_to_host() {
		return variable_sip_to_host;
	}

	public void setVariable_sip_to_host(String variable_sip_to_host) {
		this.variable_sip_to_host = variable_sip_to_host;
	}

	public String getVariable_sip_contact_params() {
		return variable_sip_contact_params;
	}

	public void setVariable_sip_contact_params(String variable_sip_contact_params) {
		this.variable_sip_contact_params = variable_sip_contact_params;
	}

	public String getVariable_sip_contact_user() {
		return variable_sip_contact_user;
	}

	public void setVariable_sip_contact_user(String variable_sip_contact_user) {
		this.variable_sip_contact_user = variable_sip_contact_user;
	}

	public String getVariable_sip_contact_port() {
		return variable_sip_contact_port;
	}

	public void setVariable_sip_contact_port(String variable_sip_contact_port) {
		this.variable_sip_contact_port = variable_sip_contact_port;
	}

	public String getVariable_sip_contact_uri() {
		return variable_sip_contact_uri;
	}

	public void setVariable_sip_contact_uri(String variable_sip_contact_uri) {
		this.variable_sip_contact_uri = variable_sip_contact_uri;
	}

	public String getVariable_sip_contact_host() {
		return variable_sip_contact_host;
	}

	public void setVariable_sip_contact_host(String variable_sip_contact_host) {
		this.variable_sip_contact_host = variable_sip_contact_host;
	}

	public String getVariable_rtp_use_codec_string() {
		return variable_rtp_use_codec_string;
	}

	public void setVariable_rtp_use_codec_string(String variable_rtp_use_codec_string) {
		this.variable_rtp_use_codec_string = variable_rtp_use_codec_string;
	}

	public String getVariable_sip_user_agent() {
		return variable_sip_user_agent;
	}

	public void setVariable_sip_user_agent(String variable_sip_user_agent) {
		this.variable_sip_user_agent = variable_sip_user_agent;
	}

	public String getVariable_sip_via_host() {
		return variable_sip_via_host;
	}

	public void setVariable_sip_via_host(String variable_sip_via_host) {
		this.variable_sip_via_host = variable_sip_via_host;
	}

	public String getVariable_sip_via_port() {
		return variable_sip_via_port;
	}

	public void setVariable_sip_via_port(String variable_sip_via_port) {
		this.variable_sip_via_port = variable_sip_via_port;
	}

	public String getVariable_sip_via_rport() {
		return variable_sip_via_rport;
	}

	public void setVariable_sip_via_rport(String variable_sip_via_rport) {
		this.variable_sip_via_rport = variable_sip_via_rport;
	}

	public String getVariable_max_forwards() {
		return variable_max_forwards;
	}

	public void setVariable_max_forwards(String variable_max_forwards) {
		this.variable_max_forwards = variable_max_forwards;
	}

	public String getVariable_presence_id() {
		return variable_presence_id;
	}

	public void setVariable_presence_id(String variable_presence_id) {
		this.variable_presence_id = variable_presence_id;
	}

	public String getVariable_switch_r_sdp() {
		return variable_switch_r_sdp;
	}

	public void setVariable_switch_r_sdp(String variable_switch_r_sdp) {
		this.variable_switch_r_sdp = variable_switch_r_sdp;
	}

	public String getVariable_ep_codec_string() {
		return variable_ep_codec_string;
	}

	public void setVariable_ep_codec_string(String variable_ep_codec_string) {
		this.variable_ep_codec_string = variable_ep_codec_string;
	}

	public String getVariable_endpoint_disposition() {
		return variable_endpoint_disposition;
	}

	public void setVariable_endpoint_disposition(String variable_endpoint_disposition) {
		this.variable_endpoint_disposition = variable_endpoint_disposition;
	}

	public String getVariable_call_uuid() {
		return variable_call_uuid;
	}

	public void setVariable_call_uuid(String variable_call_uuid) {
		this.variable_call_uuid = variable_call_uuid;
	}

	public String getHunt_Direction() {
		return Hunt_Direction;
	}

	public void setHunt_Direction(String hunt_Direction) {
		Hunt_Direction = hunt_Direction;
	}

	public String getHunt_Logical_Direction() {
		return Hunt_Logical_Direction;
	}

	public void setHunt_Logical_Direction(String hunt_Logical_Direction) {
		Hunt_Logical_Direction = hunt_Logical_Direction;
	}

	public String getHunt_Username() {
		return Hunt_Username;
	}

	public void setHunt_Username(String hunt_Username) {
		Hunt_Username = hunt_Username;
	}

	public String getHunt_Dialplan() {
		return Hunt_Dialplan;
	}

	public void setHunt_Dialplan(String hunt_Dialplan) {
		Hunt_Dialplan = hunt_Dialplan;
	}

	public String getHunt_Caller_ID_Name() {
		return Hunt_Caller_ID_Name;
	}

	public void setHunt_Caller_ID_Name(String hunt_Caller_ID_Name) {
		Hunt_Caller_ID_Name = hunt_Caller_ID_Name;
	}

	public String getHunt_Caller_ID_Number() {
		return Hunt_Caller_ID_Number;
	}

	public void setHunt_Caller_ID_Number(String hunt_Caller_ID_Number) {
		Hunt_Caller_ID_Number = hunt_Caller_ID_Number;
	}

	public String getHunt_Orig_Caller_ID_Name() {
		return Hunt_Orig_Caller_ID_Name;
	}

	public void setHunt_Orig_Caller_ID_Name(String hunt_Orig_Caller_ID_Name) {
		Hunt_Orig_Caller_ID_Name = hunt_Orig_Caller_ID_Name;
	}

	public String getHunt_Orig_Caller_ID_Number() {
		return Hunt_Orig_Caller_ID_Number;
	}

	public void setHunt_Orig_Caller_ID_Number(String hunt_Orig_Caller_ID_Number) {
		Hunt_Orig_Caller_ID_Number = hunt_Orig_Caller_ID_Number;
	}

	public String getHunt_Network_Addr() {
		return Hunt_Network_Addr;
	}

	public void setHunt_Network_Addr(String hunt_Network_Addr) {
		Hunt_Network_Addr = hunt_Network_Addr;
	}

	public String getHunt_ANI() {
		return Hunt_ANI;
	}

	public void setHunt_ANI(String hunt_ANI) {
		Hunt_ANI = hunt_ANI;
	}

	public String getHunt_Destination_Number() {
		return Hunt_Destination_Number;
	}

	public void setHunt_Destination_Number(String hunt_Destination_Number) {
		Hunt_Destination_Number = hunt_Destination_Number;
	}

	public String getHunt_Unique_ID() {
		return Hunt_Unique_ID;
	}

	public void setHunt_Unique_ID(String hunt_Unique_ID) {
		Hunt_Unique_ID = hunt_Unique_ID;
	}

	public String getHunt_Source() {
		return Hunt_Source;
	}

	public void setHunt_Source(String hunt_Source) {
		Hunt_Source = hunt_Source;
	}

	public String getHunt_Context() {
		return Hunt_Context;
	}

	public void setHunt_Context(String hunt_Context) {
		Hunt_Context = hunt_Context;
	}

	public String getHunt_Channel_Name() {
		return Hunt_Channel_Name;
	}

	public void setHunt_Channel_Name(String hunt_Channel_Name) {
		Hunt_Channel_Name = hunt_Channel_Name;
	}

	public String getHunt_Profile_Index() {
		return Hunt_Profile_Index;
	}

	public void setHunt_Profile_Index(String hunt_Profile_Index) {
		Hunt_Profile_Index = hunt_Profile_Index;
	}

	public String getHunt_Profile_Created_Time() {
		return Hunt_Profile_Created_Time;
	}

	public void setHunt_Profile_Created_Time(String hunt_Profile_Created_Time) {
		Hunt_Profile_Created_Time = hunt_Profile_Created_Time;
	}

	public String getHunt_Channel_Created_Time() {
		return Hunt_Channel_Created_Time;
	}

	public void setHunt_Channel_Created_Time(String hunt_Channel_Created_Time) {
		Hunt_Channel_Created_Time = hunt_Channel_Created_Time;
	}

	public String getHunt_Channel_Answered_Time() {
		return Hunt_Channel_Answered_Time;
	}

	public void setHunt_Channel_Answered_Time(String hunt_Channel_Answered_Time) {
		Hunt_Channel_Answered_Time = hunt_Channel_Answered_Time;
	}

	public String getHunt_Channel_Progress_Time() {
		return Hunt_Channel_Progress_Time;
	}

	public void setHunt_Channel_Progress_Time(String hunt_Channel_Progress_Time) {
		Hunt_Channel_Progress_Time = hunt_Channel_Progress_Time;
	}

	public String getHunt_Channel_Progress_Media_Time() {
		return Hunt_Channel_Progress_Media_Time;
	}

	public void setHunt_Channel_Progress_Media_Time(String hunt_Channel_Progress_Media_Time) {
		Hunt_Channel_Progress_Media_Time = hunt_Channel_Progress_Media_Time;
	}

	public String getHunt_Channel_Hangup_Time() {
		return Hunt_Channel_Hangup_Time;
	}

	public void setHunt_Channel_Hangup_Time(String hunt_Channel_Hangup_Time) {
		Hunt_Channel_Hangup_Time = hunt_Channel_Hangup_Time;
	}

	public String getHunt_Channel_Transfer_Time() {
		return Hunt_Channel_Transfer_Time;
	}

	public void setHunt_Channel_Transfer_Time(String hunt_Channel_Transfer_Time) {
		Hunt_Channel_Transfer_Time = hunt_Channel_Transfer_Time;
	}

	public String getHunt_Channel_Resurrect_Time() {
		return Hunt_Channel_Resurrect_Time;
	}

	public void setHunt_Channel_Resurrect_Time(String hunt_Channel_Resurrect_Time) {
		Hunt_Channel_Resurrect_Time = hunt_Channel_Resurrect_Time;
	}

	public String getHunt_Channel_Bridged_Time() {
		return Hunt_Channel_Bridged_Time;
	}

	public void setHunt_Channel_Bridged_Time(String hunt_Channel_Bridged_Time) {
		Hunt_Channel_Bridged_Time = hunt_Channel_Bridged_Time;
	}

	public String getHunt_Channel_Last_Hold() {
		return Hunt_Channel_Last_Hold;
	}

	public void setHunt_Channel_Last_Hold(String hunt_Channel_Last_Hold) {
		Hunt_Channel_Last_Hold = hunt_Channel_Last_Hold;
	}

	public String getHunt_Channel_Hold_Accum() {
		return Hunt_Channel_Hold_Accum;
	}

	public void setHunt_Channel_Hold_Accum(String hunt_Channel_Hold_Accum) {
		Hunt_Channel_Hold_Accum = hunt_Channel_Hold_Accum;
	}

	public String getHunt_Screen_Bit() {
		return Hunt_Screen_Bit;
	}

	public void setHunt_Screen_Bit(String hunt_Screen_Bit) {
		Hunt_Screen_Bit = hunt_Screen_Bit;
	}

	public String getHunt_Privacy_Hide_Name() {
		return Hunt_Privacy_Hide_Name;
	}

	public void setHunt_Privacy_Hide_Name(String hunt_Privacy_Hide_Name) {
		Hunt_Privacy_Hide_Name = hunt_Privacy_Hide_Name;
	}

	public String getHunt_Privacy_Hide_Number() {
		return Hunt_Privacy_Hide_Number;
	}

	public void setHunt_Privacy_Hide_Number(String hunt_Privacy_Hide_Number) {
		Hunt_Privacy_Hide_Number = hunt_Privacy_Hide_Number;
	}

	@Override
	public String toString() {
		return "Dialplan [hostname=" + hostname + ", section=" + section + ", tag_name=" + tag_name + ", key_name="
				+ key_name + ", key_value=" + key_value + ", Event_Name=" + Event_Name + ", Core_UUID=" + Core_UUID
				+ ", FreeSWITCH_Hostname=" + FreeSWITCH_Hostname + ", FreeSWITCH_Switchname=" + FreeSWITCH_Switchname
				+ ", FreeSWITCH_IPv4=" + FreeSWITCH_IPv4 + ", FreeSWITCH_IPv6=" + FreeSWITCH_IPv6
				+ ", Event_Date_Local=" + Event_Date_Local + ", Event_Date_GMT=" + Event_Date_GMT
				+ ", Event_Date_Timestamp=" + Event_Date_Timestamp + ", Event_Calling_File=" + Event_Calling_File
				+ ", Event_Calling_Function=" + Event_Calling_Function + ", Event_Calling_Line_Number="
				+ Event_Calling_Line_Number + ", Event_Sequence=" + Event_Sequence + ", Channel_State=" + Channel_State
				+ ", Channel_Call_State=" + Channel_Call_State + ", Channel_State_Number=" + Channel_State_Number
				+ ", Channel_Name=" + Channel_Name + ", Unique_ID=" + Unique_ID + ", Call_Direction=" + Call_Direction
				+ ", Presence_Call_Direction=" + Presence_Call_Direction + ", Channel_HIT_Dialplan="
				+ Channel_HIT_Dialplan + ", Channel_Presence_ID=" + Channel_Presence_ID + ", Channel_Call_UUID="
				+ Channel_Call_UUID + ", Answer_State=" + Answer_State + ", Caller_Direction=" + Caller_Direction
				+ ", Caller_Logical_Direction=" + Caller_Logical_Direction + ", Caller_Username=" + Caller_Username
				+ ", Caller_Dialplan=" + Caller_Dialplan + ", Caller_Caller_ID_Name=" + Caller_Caller_ID_Name
				+ ", Caller_Caller_ID_Number=" + Caller_Caller_ID_Number + ", Caller_Orig_Caller_ID_Name="
				+ Caller_Orig_Caller_ID_Name + ", Caller_Orig_Caller_ID_Number=" + Caller_Orig_Caller_ID_Number
				+ ", Caller_Network_Addr=" + Caller_Network_Addr + ", Caller_ANI=" + Caller_ANI
				+ ", Caller_Destination_Number=" + Caller_Destination_Number + ", Caller_Unique_ID=" + Caller_Unique_ID
				+ ", Caller_Source=" + Caller_Source + ", Caller_Context=" + Caller_Context + ", Caller_Channel_Name="
				+ Caller_Channel_Name + ", Caller_Profile_Index=" + Caller_Profile_Index
				+ ", Caller_Profile_Created_Time=" + Caller_Profile_Created_Time + ", Caller_Channel_Created_Time="
				+ Caller_Channel_Created_Time + ", Caller_Channel_Answered_Time=" + Caller_Channel_Answered_Time
				+ ", Caller_Channel_Progress_Time=" + Caller_Channel_Progress_Time
				+ ", Caller_Channel_Progress_Media_Time=" + Caller_Channel_Progress_Media_Time
				+ ", Caller_Channel_Hangup_Time=" + Caller_Channel_Hangup_Time + ", Caller_Channel_Transfer_Time="
				+ Caller_Channel_Transfer_Time + ", Caller_Channel_Resurrect_Time=" + Caller_Channel_Resurrect_Time
				+ ", Caller_Channel_Bridged_Time=" + Caller_Channel_Bridged_Time + ", Caller_Channel_Last_Hold="
				+ Caller_Channel_Last_Hold + ", Caller_Channel_Hold_Accum=" + Caller_Channel_Hold_Accum
				+ ", Caller_Screen_Bit=" + Caller_Screen_Bit + ", Caller_Privacy_Hide_Name=" + Caller_Privacy_Hide_Name
				+ ", Caller_Privacy_Hide_Number=" + Caller_Privacy_Hide_Number + ", variable_direction="
				+ variable_direction + ", variable_uuid=" + variable_uuid + ", variable_session_id="
				+ variable_session_id + ", variable_sip_from_user=" + variable_sip_from_user
				+ ", variable_sip_from_uri=" + variable_sip_from_uri + ", variable_sip_from_host="
				+ variable_sip_from_host + ", variable_video_media_flow=" + variable_video_media_flow
				+ ", variable_audio_media_flow=" + variable_audio_media_flow + ", variable_text_media_flow="
				+ variable_text_media_flow + ", variable_channel_name=" + variable_channel_name
				+ ", variable_sip_call_id=" + variable_sip_call_id + ", variable_sip_local_network_addr="
				+ variable_sip_local_network_addr + ", variable_sip_network_ip=" + variable_sip_network_ip
				+ ", variable_sip_network_port=" + variable_sip_network_port + ", variable_sip_invite_stamp="
				+ variable_sip_invite_stamp + ", variable_sip_received_ip=" + variable_sip_received_ip
				+ ", variable_sip_received_port=" + variable_sip_received_port + ", variable_sip_via_protocol="
				+ variable_sip_via_protocol + ", variable_sip_authorized=" + variable_sip_authorized
				+ ", variable_Event_Name=" + variable_Event_Name + ", variable_Core_UUID=" + variable_Core_UUID
				+ ", variable_FreeSWITCH_Hostname=" + variable_FreeSWITCH_Hostname + ", variable_FreeSWITCH_Switchname="
				+ variable_FreeSWITCH_Switchname + ", variable_FreeSWITCH_IPv4=" + variable_FreeSWITCH_IPv4
				+ ", variable_FreeSWITCH_IPv6=" + variable_FreeSWITCH_IPv6 + ", variable_Event_Date_Local="
				+ variable_Event_Date_Local + ", variable_Event_Date_GMT=" + variable_Event_Date_GMT
				+ ", variable_Event_Date_Timestamp=" + variable_Event_Date_Timestamp + ", variable_Event_Calling_File="
				+ variable_Event_Calling_File + ", variable_Event_Calling_Function=" + variable_Event_Calling_Function
				+ ", variable_Event_Calling_Line_Number=" + variable_Event_Calling_Line_Number
				+ ", variable_Event_Sequence=" + variable_Event_Sequence + ", variable_sip_number_alias="
				+ variable_sip_number_alias + ", variable_sip_auth_username=" + variable_sip_auth_username
				+ ", variable_sip_auth_realm=" + variable_sip_auth_realm + ", variable_number_alias="
				+ variable_number_alias + ", variable_requested_user_name=" + variable_requested_user_name
				+ ", variable_requested_domain_name=" + variable_requested_domain_name + ", variable_record_stereo="
				+ variable_record_stereo + ", variable_default_gateway=" + variable_default_gateway
				+ ", variable_default_areacode=" + variable_default_areacode + ", variable_transfer_fallback_extension="
				+ variable_transfer_fallback_extension + ", variable_toll_allow=" + variable_toll_allow
				+ ", variable_accountcode=" + variable_accountcode + ", variable_user_context=" + variable_user_context
				+ ", variable_effective_caller_id_name=" + variable_effective_caller_id_name
				+ ", variable_effective_caller_id_number=" + variable_effective_caller_id_number
				+ ", variable_outbound_caller_id_name=" + variable_outbound_caller_id_name
				+ ", variable_outbound_caller_id_number=" + variable_outbound_caller_id_number + ", variable_callgroup="
				+ variable_callgroup + ", variable_user_name=" + variable_user_name + ", variable_domain_name="
				+ variable_domain_name + ", variable_sip_from_user_stripped=" + variable_sip_from_user_stripped
				+ ", variable_sip_from_tag=" + variable_sip_from_tag + ", variable_sofia_profile_name="
				+ variable_sofia_profile_name + ", variable_sofia_profile_url=" + variable_sofia_profile_url
				+ ", variable_recovery_profile_name=" + variable_recovery_profile_name + ", variable_sip_full_via="
				+ variable_sip_full_via + ", variable_sip_full_from=" + variable_sip_full_from
				+ ", variable_sip_full_to=" + variable_sip_full_to + ", variable_sip_allow=" + variable_sip_allow
				+ ", variable_sip_req_user=" + variable_sip_req_user + ", variable_sip_req_uri=" + variable_sip_req_uri
				+ ", variable_sip_req_host=" + variable_sip_req_host + ", variable_sip_to_user=" + variable_sip_to_user
				+ ", variable_sip_to_uri=" + variable_sip_to_uri + ", variable_sip_to_host=" + variable_sip_to_host
				+ ", variable_sip_contact_params=" + variable_sip_contact_params + ", variable_sip_contact_user="
				+ variable_sip_contact_user + ", variable_sip_contact_port=" + variable_sip_contact_port
				+ ", variable_sip_contact_uri=" + variable_sip_contact_uri + ", variable_sip_contact_host="
				+ variable_sip_contact_host + ", variable_rtp_use_codec_string=" + variable_rtp_use_codec_string
				+ ", variable_sip_user_agent=" + variable_sip_user_agent + ", variable_sip_via_host="
				+ variable_sip_via_host + ", variable_sip_via_port=" + variable_sip_via_port
				+ ", variable_sip_via_rport=" + variable_sip_via_rport + ", variable_max_forwards="
				+ variable_max_forwards + ", variable_presence_id=" + variable_presence_id + ", variable_switch_r_sdp="
				+ variable_switch_r_sdp + ", variable_ep_codec_string=" + variable_ep_codec_string
				+ ", variable_endpoint_disposition=" + variable_endpoint_disposition + ", variable_call_uuid="
				+ variable_call_uuid + ", Hunt_Direction=" + Hunt_Direction + ", Hunt_Logical_Direction="
				+ Hunt_Logical_Direction + ", Hunt_Username=" + Hunt_Username + ", Hunt_Dialplan=" + Hunt_Dialplan
				+ ", Hunt_Caller_ID_Name=" + Hunt_Caller_ID_Name + ", Hunt_Caller_ID_Number=" + Hunt_Caller_ID_Number
				+ ", Hunt_Orig_Caller_ID_Name=" + Hunt_Orig_Caller_ID_Name + ", Hunt_Orig_Caller_ID_Number="
				+ Hunt_Orig_Caller_ID_Number + ", Hunt_Network_Addr=" + Hunt_Network_Addr + ", Hunt_ANI=" + Hunt_ANI
				+ ", Hunt_Destination_Number=" + Hunt_Destination_Number + ", Hunt_Unique_ID=" + Hunt_Unique_ID
				+ ", Hunt_Source=" + Hunt_Source + ", Hunt_Context=" + Hunt_Context + ", Hunt_Channel_Name="
				+ Hunt_Channel_Name + ", Hunt_Profile_Index=" + Hunt_Profile_Index + ", Hunt_Profile_Created_Time="
				+ Hunt_Profile_Created_Time + ", Hunt_Channel_Created_Time=" + Hunt_Channel_Created_Time
				+ ", Hunt_Channel_Answered_Time=" + Hunt_Channel_Answered_Time + ", Hunt_Channel_Progress_Time="
				+ Hunt_Channel_Progress_Time + ", Hunt_Channel_Progress_Media_Time=" + Hunt_Channel_Progress_Media_Time
				+ ", Hunt_Channel_Hangup_Time=" + Hunt_Channel_Hangup_Time + ", Hunt_Channel_Transfer_Time="
				+ Hunt_Channel_Transfer_Time + ", Hunt_Channel_Resurrect_Time=" + Hunt_Channel_Resurrect_Time
				+ ", Hunt_Channel_Bridged_Time=" + Hunt_Channel_Bridged_Time + ", Hunt_Channel_Last_Hold="
				+ Hunt_Channel_Last_Hold + ", Hunt_Channel_Hold_Accum=" + Hunt_Channel_Hold_Accum + ", Hunt_Screen_Bit="
				+ Hunt_Screen_Bit + ", Hunt_Privacy_Hide_Name=" + Hunt_Privacy_Hide_Name + ", Hunt_Privacy_Hide_Number="
				+ Hunt_Privacy_Hide_Number + "]";
	}
	
	

}
