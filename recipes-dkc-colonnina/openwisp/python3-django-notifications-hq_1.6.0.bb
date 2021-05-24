
SUMMARY = "GitHub notifications alike app for Django."
HOMEPAGE = "http://github.com/django-notifications/django-notifications"
AUTHOR = "django-notifications team <yang@yangyubo.com>"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=796ba194191a38d5b584bb8ca963762e"

SRC_URI = "https://files.pythonhosted.org/packages/12/b9/dd3525a3af44dea70a67f614056750daf4f506a32b1c8af41a2dd335b244/django-notifications-hq-1.6.0.tar.gz"
SRC_URI[md5sum] = "315924588c4b6ff29b3b61407e6e9a0a"
SRC_URI[sha256sum] = "debeb71b7076b08487b40bf07664d1cc43b9977c4480bbc969b30236dda7a461"

S = "${WORKDIR}/django-notifications-hq-1.6.0"

RDEPENDS_${PN} = "python3-django-model-utils python3-django python3-jsonfield python3-pytz python3-swapper"

inherit setuptools3
