 ```json postpaid_active_policy
{
  "responseVersion": 1751600396609,
  "policyModel": {
    "reference": {
      "id": "/DEVECO/ACTIVE/1751600396609",
      "version": 1751600396609,
      "type": "POSTPAID",
      "assignedTime": 1677747921,
      "tags": {
        "hidden": "false",
        "name": "REGULAR_POLICY"
      }
    },
    "definition": {
      "alpsAction": "FULLSCREEN",
      "alpsActionScheduling": {
        "activationDuration": null
      },
      "checkin": {
        "period": 3600
      },
      "releaseClient": false,
      "presentation": {
        "texts": {
          "title": {
            "labels": {
              "default": "Payment is up to date",
              "en_GB": "Payment is up to date",
              "es_ES": "Tus pagos están al día"
            },
            "color": "#ff5772"
          },
          "message": {
            "labels": {
              "default": "This handset is financed. Your payments are up to date, and there is nothing to pay at this time. Have a great day!",
              "en_GB": "This handset is financed. Your payments are up to date, and there is nothing to pay at this time. Have a great day!",
              "es_ES": "Este teléfono está financiado. Tus pagos están al día y no hay importes pendientes. ¡Que tengas un buen día!"
            },
            "color": "#9a9aa3"
          },
          "secondaryMessage": {
            "labels": {
              "default": "",
              "en_GB": "",
              "es_ES": ""
            },
            "color": "#fb0404"
          }
        },
        "images": {
          "notification": {
            "path": "drawables/notification.svg"
          },
          "policy": {
            "path": "drawables/up_to_date.svg"
          }
        },
        "buttons": {},
        "color": "#ff5772",
        "email": "a.a@a.com",
        "tel": "+84799797979"
      },
      "unlockPinTransition": {
        "reference": {
          "id": "/DEVECO/PIN_UNLOCK",
          "tags": {}
        }
      },
      "bootMessageEnabled": true,
      "simControl": true,
      "prepaid": false,
      "simControlPolicy": {
        "reference": {
          "id": "/DEVECO/NETWORK_CONTROL",
          "version": 1751600396309
        }
      },
      "staleTransition": {
        "reference": {
          "id": "/DEVECO/OFFLINE_WARNING",
          "tags": {}
        },
        "delay": 172800
      }
    }
  },
  "referencePolicies": [
    {
      "reference": {
        "id": "/DEVECO/OFFLINE_LOCK",
        "version": 1751600396509,
        "type": "POSTPAID",
        "tags": {
          "hidden": "false",
          "name": "non_dismissible"
        }
      },
      "definition": {
        "alpsAction": "SCREENLOCK",
        "alpsActionScheduling": {
          "delayInitialActivation": false,
          "nonDismissible": true,
          "oncePerDay": false
        },
        "checkin": {
          "period": 60
        },
        "releaseClient": false,
        "presentation": {
          "texts": {
            "title": {
              "labels": {
                "default": "Offline Lock",
                "en_GB": "Offline Lock",
                "es_ES": "Bloqueo fuera de línea",
                "it_IT": "Lock Title (IT_IT)",
                "th_TH": "Lock Title (th_TH)",
                "vi_VN": "Lock Title (VI_VN)",
                "om_ET": "Lock Title (om_ET)",
                "es_MX": "Lock Title (es_MX)"
              },
              "color": "#ff5772"
            },
            "message": {
              "labels": {
                "default": "Your device has been restricted because it has not been online for 30 days. To remove these restrictions, please connect this device to the internet, or, insert a SIMs.  - Postpaid [Offline Lock]",
                "en_GB": "Your device has been restricted because it has not been online for 30 days. To remove these restrictions, please connect this device to the internet, or, insert a SIMs.  - Postpaid [Offline Lock]",
                "es_ES": "Tu dispositivo se encuentra restringido porque lleva 30 días sin conectarse a Internet. Para eliminar estas restricciones, conecta este dispositivo a Internet o inserta una tarjeta SIM.",
                "it_IT": "Lock Message (IT_IT)\n",
                "vi_VN": "Lock Message (VI_VN)",
                "om_ET": "Lock Message (om_ET)",
                "es_MX": "Lock Message (es_MX)\n"
              },
              "color": "#9a9aa3"
            },
            "secondaryMessage": {
              "labels": {
                "default": "",
                "en_GB": "",
                "es_ES": "",
                "it_IT": "",
                "vi_VN": "",
                "om_ET": "",
                "es_MX": ""
              },
              "color": "#fb0404"
            }
          },
          "images": {
            "notification": {
              "path": "drawables/notification.svg"
            },
            "policy": {
              "path": "drawables/offline.svg"
            }
          },
          "color": "#ff5772",
          "tel": "+84799797979",
          "email": "a.a@a.com"
        },
        "bootMessageEnabled": false,
        "simControl": true,
        "prepaid": false,
        "simControlPolicy": {
          "reference": {
            "id": "/DEVECO/NETWORK_CONTROL",
            "version": 1751600396309
          }
        }
      }
    },
    {
      "reference": {
        "id": "/DEVECO/OFFLINE_WARNING",
        "version": 1751600396509,
        "type": "POSTPAID",
        "tags": {
          "hidden": "false",
          "name": "non_dismissible"
        }
      },
      "definition": {
        "alpsAction": "NOTIFICATION",
        "alpsActionScheduling": {
          "delayInitialActivation": false,
          "nonDismissible": true,
          "oncePerDay": false
        },
        "checkin": {
          "period": 10
        },
        "staleTransition": {
          "reference": {
            "id": "/DEVECO/OFFLINE_LOCK",
            "tags": {}
          },
          "delay": 604800
        },
        "releaseClient": false,
        "presentation": {
          "texts": {
            "title": {
              "labels": {
                "default": ""
              },
              "color": "#ff5772"
            },
            "message": {
              "labels": {
                "default": "Your device is about to be locked as it has not been able to communicate with network for the past 30 days. Your device will be locked in 24 hours if stays offline. - Postpaid [Offline Warning]",
                "en_GB": "Your device is about to be locked as it has not been able to communicate with network for the past 30 days. Your device will be locked in 24 hours if stays offline. - Postpaid [Offline Warning]",
                "es_ES": "Tu dispositivo está a punto de ser bloqueado ya que no te has comunicado con el operador móvil en los últimos 30 días. Tu dispositivo se bloqueará en 24 horas si permanece desconectado.",
                "fr_FR": "Warning Message (fr_FR)",
                "it_IT": "Warning Message (IT_IT)",
                "vi_VN": "Warning Message (VI_VN)",
                "om_ET": "Warning Message (om_ET)",
                "es_MX": "Warning Message (es_MX)"
              },
              "color": "#9a9aa3"
            },
            "secondaryMessage": {
              "labels": {
                "default": "",
                "en_GB": "",
                "es_ES": "",
                "fr_FR": "",
                "it_IT": "",
                "vi_VN": "",
                "om_ET": "",
                "es_MX": ""
              },
              "color": "#fb0404"
            }
          },
          "images": {
            "notification": {
              "path": "drawables/notification.svg"
            },
            "policy": {
              "path": "drawables/offline.svg"
            }
          },
          "color": "#ff5772",
          "tel": "+84799797979",
          "email": "a.a@a.com"
        },
        "bootMessageEnabled": false,
        "simControl": true,
        "prepaid": false,
        "simControlPolicy": {
          "reference": {
            "id": "/DEVECO/NETWORK_CONTROL",
            "version": 1751600396309
          }
        }
      }
    },
    {
      "reference": {
        "id": "/DEVECO/PIN_UNLOCK",
        "version": 1667907817207,
        "type": "POSTPAID",
        "tags": {
          "hidden": "false",
          "name": "unlock_policy"
        }
      },
      "definition": {
        "alpsAction": "NONE",
        "alpsActionScheduling": {
          "delayInitialActivation": false,
          "nonDismissible": false,
          "oncePerDay": false
        },
        "checkin": {
          "period": 10
        },
        "releaseClient": false,
        "presentation": {
          "texts": {
            "title": {
              "labels": {
                "default": ""
              },
              "color": "#ff5772"
            },
            "message": {
              "labels": {
                "default": ""
              },
              "color": "#9a9aa3"
            },
            "secondaryMessage": {
              "labels": {
                "default": ""
              },
              "color": "#fb0404"
            }
          },
          "images": {
            "notification": {
              "path": "drawables/notification.svg"
            },
            "policy": {
              "path": "drawables/up_to_date.svg"
            }
          },
          "color": "#ff5772",
          "tel": "+84799797979",
          "email": "a.a@a.com"
        },
        "bootMessageEnabled": false,
        "simControl": false,
        "prepaid": false,
        "staleTransition": {
          "reference": {
            "id": "/DEVECO/OFFLINE_WARNING",
            "tags": {}
          },
          "delay": 172800
        }
      }
    }
  ],
  "currentSysTimeUtc": 1678073186,
  "holidays": [],
  "simControlReference": [
    {
      "reference": {
        "id": "/DEVECO/NETWORK_CONTROL",
        "version": 1751600396309,
        "type": "SIM_CONTROL",
        "tags": {
          "name": "Sim Control Policy",
          "kgPolicyReference": "",
          "hidden": "false"
        }
      },
      "definition": {
        "whiteLists": [
          {
            "mcc": "111",
            "mnc": "111",
            "g1": "1"
          }
        ],
        "simRestrictions": {
          "enabled": true,
          "enforceDataUsageRestriction": false,
          "enforceIncomingCallRestriction": false,
          "enforceOutgoingCallRestriction": false,
          "enforceSMSMMSRestriction": false,
          "enforceRestrictionToRoaming": false,
          "whitelistOutgoingNumbers": [],
          "whitelistIncomingNumbers": []
        },
        "deviceLockRestrictions": {
          "enabled": true,
          "enforceMobileNumberIMSILock": false,
          "enforceVerifyNetwork": false,
          "enableLockForNoSim": false
        },
        "presentation": {
          "texts": {
            "lockMessage": {
              "labels": {
                "default": "a"
              },
              "color": "#9a9aa3"
            },
            "lockTitle": {
              "labels": {
                "default": "a"
              },
              "color": "#ff5772"
            },
            "lockIMSIMessage": {
              "labels": {
                "default": "Enter message"
              },
              "color": "#9a9aa3"
            }
          },
          "images": {
            "restrictionNotificationIcon": {
              "path": "drawables/notification.svg"
            },
            "lockIcon": {
              "path": "drawables/notification.svg"
            }
          },
          "buttons": {},
          "color": "#ff5772",
          "tel": "+84799797979",
          "email": "a.a@a.com"
        }
      }
    }
  ],
  "prepaidNotificationReferencePolicies": [],
  "activeUsers": [
    0
  ],
  "deviceCustomProperties": {
    "Organization Name": "Org",
    "Account Number": "",
    "Due Date": "",
    "Amount owed": "123456",
    "Days past due": "",
    "Phone number": "",
    "WhatsApp number": "",
    "Email ": ""
  }
}
```
postpaid_active_to_idle_policy
 ```json 
{
  "responseVersion": 1751604023650,
  "policyModel": {
    "reference": {
      "id": "/DEVECO/ACTIVE/1751604023650",
      "version": 1751604023650,
      "type": "POSTPAID",
      "assignedTime": 1677747921,
      "tags": {
        "hidden": "false",
        "name": "REGULAR_POLICY"
      }
    },
    "definition": {
      "alpsAction": "FULLSCREEN",
      "alpsActionScheduling": {
        "activationDuration": null
      },
      "checkin": {
        "period": 3600
      },
      "releaseClient": false,
      "presentation": {
        "texts": {
          "title": {
            "labels": {
              "default": "Payment is up to date",
              "en_GB": "Payment is up to date",
              "es_ES": "Tus pagos están al día"
            },
            "color": "#ff5772"
          },
          "message": {
            "labels": {
              "default": "This handset is financed. Your payments are up to date, and there is nothing to pay at this time. Have a great day!",
              "en_GB": "This handset is financed. Your payments are up to date, and there is nothing to pay at this time. Have a great day!",
              "es_ES": "Este teléfono está financiado. Tus pagos están al día y no hay importes pendientes. ¡Que tengas un buen día!"
            },
            "color": "#9a9aa3"
          },
          "secondaryMessage": {
            "labels": {
              "default": "",
              "en_GB": "",
              "es_ES": ""
            },
            "color": "#fb0404"
          }
        },
        "images": {
          "notification": {
            "path": "drawables/notification.svg"
          },
          "policy": {
            "path": "drawables/up_to_date.svg"
          }
        },
        "buttons": {},
        "color": "#ff5772",
        "email": "a.a@a.com",
        "tel": "+84799797979"
      },
      "unlockPinTransition": {
        "reference": {
          "id": "/DEVECO/PIN_UNLOCK",
          "tags": {}
        }
      },
      "bootMessageEnabled": true,
      "simControl": true,
      "prepaid": false,
      "simControlPolicy": {
        "reference": {
          "id": "/DEVECO/NETWORK_CONTROL",
          "version": 1751604023290
        }
      },
      "staleTransition": {
        "reference": {
          "id": "/DEVECO/OFFLINE_WARNING",
          "tags": {}
        },
        "delay": 172800
      }
    }
  },
  "referencePolicies": [
    {
      "reference": {
        "id": "/DEVECO/OFFLINE_LOCK",
        "version": 1751604023530,
        "type": "POSTPAID",
        "tags": {
          "hidden": "false",
          "name": "non_dismissible"
        }
      },
      "definition": {
        "alpsAction": "SCREENLOCK",
        "alpsActionScheduling": {
          "delayInitialActivation": false,
          "nonDismissible": true,
          "oncePerDay": false
        },
        "checkin": {
          "period": 60
        },
        "releaseClient": false,
        "presentation": {
          "texts": {
            "title": {
              "labels": {
                "default": "Offline Lock",
                "en_GB": "Offline Lock",
                "es_ES": "Bloqueo fuera de línea",
                "it_IT": "Lock Title (IT_IT)",
                "th_TH": "Lock Title (th_TH)",
                "vi_VN": "Lock Title (VI_VN)",
                "om_ET": "Lock Title (om_ET)",
                "es_MX": "Lock Title (es_MX)"
              },
              "color": "#ff5772"
            },
            "message": {
              "labels": {
                "default": "Your device has been restricted because it has not been online for 30 days. To remove these restrictions, please connect this device to the internet, or, insert a SIMs.  - Postpaid [Offline Lock]",
                "en_GB": "Your device has been restricted because it has not been online for 30 days. To remove these restrictions, please connect this device to the internet, or, insert a SIMs.  - Postpaid [Offline Lock]",
                "es_ES": "Tu dispositivo se encuentra restringido porque lleva 30 días sin conectarse a Internet. Para eliminar estas restricciones, conecta este dispositivo a Internet o inserta una tarjeta SIM.",
                "it_IT": "Lock Message (IT_IT)\n",
                "vi_VN": "Lock Message (VI_VN)",
                "om_ET": "Lock Message (om_ET)",
                "es_MX": "Lock Message (es_MX)\n"
              },
              "color": "#9a9aa3"
            },
            "secondaryMessage": {
              "labels": {
                "default": "",
                "en_GB": "",
                "es_ES": "",
                "it_IT": "",
                "vi_VN": "",
                "om_ET": "",
                "es_MX": ""
              },
              "color": "#fb0404"
            }
          },
          "images": {
            "notification": {
              "path": "drawables/notification.svg"
            },
            "policy": {
              "path": "drawables/offline.svg"
            }
          },
          "color": "#ff5772",
          "tel": "+84799797979",
          "email": "a.a@a.com"
        },
        "bootMessageEnabled": false,
        "simControl": true,
        "prepaid": false,
        "simControlPolicy": {
          "reference": {
            "id": "/DEVECO/NETWORK_CONTROL",
            "version": 1751604023290
          }
        }
      }
    },
    {
      "reference": {
        "id": "/DEVECO/OFFLINE_WARNING",
        "version": 1751604023530,
        "type": "POSTPAID",
        "tags": {
          "hidden": "false",
          "name": "non_dismissible"
        }
      },
      "definition": {
        "alpsAction": "NOTIFICATION",
        "alpsActionScheduling": {
          "delayInitialActivation": false,
          "nonDismissible": true,
          "oncePerDay": false
        },
        "checkin": {
          "period": 10
        },
        "staleTransition": {
          "reference": {
            "id": "/DEVECO/OFFLINE_LOCK",
            "tags": {}
          },
          "delay": 604800
        },
        "releaseClient": false,
        "presentation": {
          "texts": {
            "title": {
              "labels": {
                "default": ""
              },
              "color": "#ff5772"
            },
            "message": {
              "labels": {
                "default": "Your device is about to be locked as it has not been able to communicate with network for the past 30 days. Your device will be locked in 24 hours if stays offline. - Postpaid [Offline Warning]",
                "en_GB": "Your device is about to be locked as it has not been able to communicate with network for the past 30 days. Your device will be locked in 24 hours if stays offline. - Postpaid [Offline Warning]",
                "es_ES": "Tu dispositivo está a punto de ser bloqueado ya que no te has comunicado con el operador móvil en los últimos 30 días. Tu dispositivo se bloqueará en 24 horas si permanece desconectado.",
                "fr_FR": "Warning Message (fr_FR)",
                "it_IT": "Warning Message (IT_IT)",
                "vi_VN": "Warning Message (VI_VN)",
                "om_ET": "Warning Message (om_ET)",
                "es_MX": "Warning Message (es_MX)"
              },
              "color": "#9a9aa3"
            },
            "secondaryMessage": {
              "labels": {
                "default": "",
                "en_GB": "",
                "es_ES": "",
                "fr_FR": "",
                "it_IT": "",
                "vi_VN": "",
                "om_ET": "",
                "es_MX": ""
              },
              "color": "#fb0404"
            }
          },
          "images": {
            "notification": {
              "path": "drawables/notification.svg"
            },
            "policy": {
              "path": "drawables/offline.svg"
            }
          },
          "color": "#ff5772",
          "tel": "+84799797979",
          "email": "a.a@a.com"
        },
        "bootMessageEnabled": false,
        "simControl": true,
        "prepaid": false,
        "simControlPolicy": {
          "reference": {
            "id": "/DEVECO/NETWORK_CONTROL",
            "version": 1751604023290
          }
        }
      }
    },
    {
      "reference": {
        "id": "/DEVECO/PIN_UNLOCK",
        "version": 1667907817207,
        "type": "POSTPAID",
        "tags": {
          "hidden": "false",
          "name": "unlock_policy"
        }
      },
      "definition": {
        "alpsAction": "NONE",
        "alpsActionScheduling": {
          "delayInitialActivation": false,
          "nonDismissible": false,
          "oncePerDay": false
        },
        "checkin": {
          "period": 10
        },
        "releaseClient": false,
        "presentation": {
          "texts": {
            "title": {
              "labels": {
                "default": ""
              },
              "color": "#ff5772"
            },
            "message": {
              "labels": {
                "default": ""
              },
              "color": "#9a9aa3"
            },
            "secondaryMessage": {
              "labels": {
                "default": ""
              },
              "color": "#fb0404"
            }
          },
          "images": {
            "notification": {
              "path": "drawables/notification.svg"
            },
            "policy": {
              "path": "drawables/up_to_date.svg"
            }
          },
          "color": "#ff5772",
          "tel": "+84799797979",
          "email": "a.a@a.com"
        },
        "bootMessageEnabled": false,
        "simControl": false,
        "prepaid": false,
        "staleTransition": {
          "reference": {
            "id": "/DEVECO/OFFLINE_WARNING",
            "tags": {}
          },
          "delay": 172800
        }
      }
    }
  ],
  "currentSysTimeUtc": 1678073186,
  "holidays": [],
  "simControlReference": [
    {
      "reference": {
        "id": "/DEVECO/NETWORK_CONTROL",
        "version": 1751604023290,
        "type": "SIM_CONTROL",
        "tags": {
          "name": "Sim Control Policy",
          "kgPolicyReference": "",
          "hidden": "false"
        }
      },
      "definition": {
        "whiteLists": [
          {
            "mcc": "111",
            "mnc": "111",
            "g1": "1"
          }
        ],
        "simRestrictions": {
          "enabled": true,
          "enforceDataUsageRestriction": false,
          "enforceIncomingCallRestriction": false,
          "enforceOutgoingCallRestriction": false,
          "enforceSMSMMSRestriction": false,
          "enforceRestrictionToRoaming": false,
          "whitelistOutgoingNumbers": [],
          "whitelistIncomingNumbers": []
        },
        "deviceLockRestrictions": {
          "enabled": true,
          "enforceMobileNumberIMSILock": false,
          "enforceVerifyNetwork": false,
          "enableLockForNoSim": false
        },
        "presentation": {
          "texts": {
            "lockMessage": {
              "labels": {
                "default": "a"
              },
              "color": "#9a9aa3"
            },
            "lockTitle": {
              "labels": {
                "default": "a"
              },
              "color": "#ff5772"
            },
            "lockIMSIMessage": {
              "labels": {
                "default": "Enter message"
              },
              "color": "#9a9aa3"
            }
          },
          "images": {
            "restrictionNotificationIcon": {
              "path": "drawables/notification.svg"
            },
            "lockIcon": {
              "path": "drawables/notification.svg"
            }
          },
          "buttons": {},
          "color": "#ff5772",
          "tel": "+84799797979",
          "email": "a.a@a.com"
        }
      }
    }
  ],
  "prepaidNotificationReferencePolicies": [],
  "activeUsers": [
    0,
    1
  ],
  "deviceCustomProperties": {
    "Organization Name": "Org",
    "Account Number": "",
    "Due Date": "",
    "Amount owed": "123456",
    "Days past due": "",
    "Phone number": "",
    "WhatsApp number": "",
    "Email ": ""
  }
}
```

 ```json postpaid_locked_to_active_policy
